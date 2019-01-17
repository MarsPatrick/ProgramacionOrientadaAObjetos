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
        
    }
    
    public boolean venderAsiento(Sala s, Asiento a){
        
    }
    
    public String obtenerInformeRecaudacion(){
        
    }
    
    public Sala buscaSalaPorNombre(String nombreSala){
        
    }
    
    public String mostrarDatos(){
        
    }
    
}
