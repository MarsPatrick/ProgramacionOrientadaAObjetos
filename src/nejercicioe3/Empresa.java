package nejercicioe3;
import java.util.Iterator;
import java.util.TreeSet;
/**
 *
 * @author Pato-Note
 */
public class Empresa {
    
    private String nombre;
    private TreeSet<Colaborador> colaboradores;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.colaboradores = new TreeSet();
    }

    public String getNombre() {
        return nombre;
    }

    public TreeSet<Colaborador> getColaboradores() {
        return colaboradores;
    }
    
    public boolean agregarColaborador(Colaborador c){
        return colaboradores.add(c);
    }
    
    public boolean desvincularColaborador(String nombre){
        for(Colaborador algo: colaboradores){
            if(algo.getNombre().compareToIgnoreCase(nombre)==0){
                colaboradores.remove(algo);
                return true;
            }
        }
        return false;
    }
    
    public int totalSueldos(){
        int x=0;
        for(Colaborador algo: colaboradores){
            x=x+algo.getSueldo();
        }
        return x;
    }
    
    public void desvincularTodosColaboradores(){
        colaboradores.clear();
    }
    
    public int desvincularPorRangoSueldo(int minimo, int maximo){
        int x=0;
        Iterator<Colaborador> i = colaboradores.iterator();
        while(i.hasNext()){
            Colaborador n = i.next();
            if(n.getSueldo()>=minimo){
                if(n.getSueldo()<=maximo){
                    i.remove();
                    x++;    
                }
            }
        }
        return x;
    }
    
    public int totalColaboradoresRangoSueldo(int minimo, int maximo){
        int x=0;
        for(Colaborador algo: colaboradores){
            if(algo.getSueldo()>minimo && algo.getSueldo()<maximo){
                x++;
            }
        }
        return x;
    }
    
    public int totalColaboradoresNombreComienzaCon(char letra){
        int x=0;
        for(Colaborador algo: colaboradores){
            if(algo.getNombre().charAt(0)==letra){
                x++;
            }
        }
        return x;
    }
    
        @Override
    public String toString(){
        String a="";
        for(Colaborador algo: colaboradores){
            a = a + algo.toString();
        }
        return a;
    }
}
