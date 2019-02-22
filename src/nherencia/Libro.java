package nherencia;
public class Libro extends Producto{
    
    private int numeroPaginas;

    public Libro(int numeroPaginas, String nombre, int precio) {
        super(nombre, precio);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
    public int montoPagar(){
        return 1;
    }
}
