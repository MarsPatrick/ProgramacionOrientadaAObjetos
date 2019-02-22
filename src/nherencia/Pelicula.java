package nherencia;
public class Pelicula extends Producto{
    
    private int duracion;
    
    public Pelicula(int duracion,String nombre, int precio) {
        super(nombre, precio);
        this.duracion=duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public int montoPagar(){
        return 1;
    }
}
