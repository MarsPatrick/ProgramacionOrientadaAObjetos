package Ejercicio7;
public class Alimento {

    private int calorias;
    private String nombre;

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int obtenerTotalCalorias(int cantidad){
        return this.calorias*cantidad;
    }
    
    public boolean esAltoEnCalorias(){
        return this.calorias>250;
    }

}