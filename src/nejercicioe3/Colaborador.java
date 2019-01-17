package nejercicioe3;
/**
 *
 * @author Pato-Note
 */
public class Colaborador {
    
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
        return("Nombre: "+this.getNombre()+"\nSueldo: $"+this.getSueldo()+"\n");
    }
    
}
