package nejercicioe3;
/**
 *
 * @author Pato-Note
 */
public class Colaborador implements Comparable<Colaborador> {
    
    private String nombre;
    private int sueldo;

    public Colaborador(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString(){
        return("Nombre: "+this.getNombre()+" Sueldo: $"+this.getSueldo()+"\n");
    }

    @Override
    public int compareTo(Colaborador t) {
        if(this.getNombre().compareToIgnoreCase(t.getNombre())==0){
            return this.getSueldo()-t.getSueldo();
        } 
        return this.getNombre().compareToIgnoreCase(t.getNombre());
    }
    
}
