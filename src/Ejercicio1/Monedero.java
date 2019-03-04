package Ejercicio1;
public class Monedero {
    
    private int total;
    
    public int getTotal(){
        return total;
    }
    
    public void agregarDinero(int cantidad){
        if(cantidad>0)
        total+=cantidad;
    }
    
    public void extraerDinero(int cantidad){
        if(cantidad>0)
        total-=cantidad;
    }
    
    public boolean estaVacio(){
        return this.total==0;
    }
}