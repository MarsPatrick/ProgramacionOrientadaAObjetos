package ntarea1;
import java.util.ArrayList;
/**
 *
 * @author Pato-Note
 */
public class Sala {
    
    private byte totalFilas;
    private byte totalColumnas;
    private Asiento[][] asientos;
    private short valorEntrada;
    private String nombre;
    private static ArrayList<Character> nombreFilas;

    public Sala(String nombre, byte totalFilas,Asiento[][] asientos, byte totalColumnas, short valorEntrada){
        this.nombre = nombre;
        this.totalFilas = totalFilas;
        this.totalColumnas = totalColumnas;
        this.valorEntrada = valorEntrada;
        this.nombreFilas = new ArrayList();
        this.asientos = asientos;
    }

    public short getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(short valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getTotalFilas() {
        return totalFilas;
    }

    public void setTotalFilas(byte totalFilas) {
        this.totalFilas = totalFilas;
    }

    public byte getTotalColumnas() {
        return totalColumnas;
    }

    public void setTotalColumnas(byte totalColumnas) {
        this.totalColumnas = totalColumnas;
    }
    
    public String mostrarOcupacion(int filaInicial, int filaFinal){
        String x="";
        for(int i=filaInicial;i<filaFinal;i++){
            for(int i2=0;i2<this.getTotalColumnas();i2++){
                if(asientos[i][i2].isLibre()){
                    x=x+"[o]";
                }else{
                    x=x+"[x]";
                } 
            }
            x=x+"\n";
        }
        return x;
    }
    
    public String mostrarOcupacion(){
        String x="";
        for(int i=0;i<this.getTotalFilas();i++){
            for(int i2=0;i2<this.getTotalColumnas();i2++){
                if(asientos[i][i2].isLibre()){
                    x=x+"[o]";
                }else{
                    x=x+"[x]";
                }     
            }
            x=x+"\n";
        }
        return x;
    }
    
    public byte totalAsientosLibres(){
        byte total=0;
        for(int i=0;i<this.getTotalFilas();i++){
            for(int i2=0;i2<this.getTotalColumnas();i2++){
                if(asientos[i][i2].isLibre())
                    total++;
            }
        }
        return total;
    }
    
    public ArrayList<Asiento> obtenerAsientosOcupados(){
        ArrayList<Asiento> ocupados = new ArrayList();
        for(int i=0;i<this.totalFilas;i++){
            for(int j=0;this.totalColumnas>=j;j++){
                if(this.asientos[i][j].isLibre()==false)
                    ocupados.add(this.asientos[i][j]);
            }
       }
       return ocupados;
    }
    
    public String mostrarDatos(){
        String d=null;
        char c='a';
            for(int j=0;j<this.totalFilas;j++){
                c=(char) (c+1);
                for(int con=0;con<this.totalColumnas;con++)
                    d=d+"["+c+con+"]";
                d=d+"\n";
            }
        return d;
    }
    
    public boolean estaDisponible(Asiento a){
        if(a.isLibre()){
            return true;
        }
        return false;
    }
    
    public boolean ocuparAsiento(Asiento a){
        int columna= a.getColumna();
        char fila=a.getFila();
        if (this.asientos[fila][columna].isLibre()== true){
            this.asientos[fila][columna].setLibre(false);
            return true;
        }
        return false;
    }
    
}
