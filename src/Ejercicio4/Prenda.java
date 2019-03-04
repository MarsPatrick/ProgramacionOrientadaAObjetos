package Ejercicio4;
public class Prenda {
    
    private char talla;
    private String descripcion;
    private int precio;

    public char getTalla() {
        return talla;
    }

    public void setTalla(char talla) {
        if(talla=="M".charAt(0) || talla=="S".charAt(0) || talla=="L".charAt(0))
            this.talla = talla;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if(precio>=1990)
            this.precio = precio;
    }
    
    public int valorPagar(float descuento){
        return (int)(this.getPrecio()*(descuento/100));
    }
    
}
