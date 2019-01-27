package ntarea1;
import java.util.ArrayList;
/**
 *
 * @author Pato-Note
 */
public class Cine {
    
    private ArrayList<Sala> salas;
    private String nombre;
    
    public Cine(String nombre){
        this.nombre = nombre;
        this.salas = new ArrayList();
    }
    
    public ArrayList<Sala> getSalas(){
        return this.salas;
    }
    
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean agregarSala(Sala s){
        for(Sala x: salas){
            if(x.getNombre().equalsIgnoreCase(s.getNombre()))
                return false;
        }    
        salas.add(s);
        return true;
    }
    
    public boolean venderAsiento(Sala s, Asiento a){
        if(s.estaDisponible(a)){
            s.ocuparAsiento(a);
            return true;
        }
        return false;
    }
    
    public String obtenerInformeRecaudacion(){
        String i="Recaudacion sala";
        int recaudacion;
        int con=0;
        for(Sala sala : salas){
            recaudacion=0;
            for(int con2=0;con2<sala.obtenerAsientosOcupados().size();con2++)
                recaudacion=recaudacion+sala.getValorEntrada();
            con=con+1;
            i=i+con+"="+recaudacion+"\n";
        }
        return i;
    }
    
    public Sala buscaSalaPorNombre(String nombreSala){
        int sala = 0;
        for(int x=0;x<this.salas.size();x++){
            if(this.salas.get(x).getNombre().equals(nombreSala))
            sala = x;
        }
        return this.salas.get(sala);
    }
    
    public String mostrarDatos(){
        String d=null;
        for(int con=0;con<this.salas.size();con++){
            d=d+this.salas.get(con).mostrarDatos()+"\n";
        }
        return d;      
    }
    
}
