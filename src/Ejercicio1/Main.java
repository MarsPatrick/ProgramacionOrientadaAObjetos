package Ejercicio1;
public class Main {
    public static void main(String[] args) {
        
        //Probar que los metodos funcionen
        
        //Crear y ver el total
        Monedero m = new Monedero();
        System.out.println(m.getTotal());
        
        //Probar el agregar dinero
        m.agregarDinero(100);
        System.out.println(m.getTotal());
        
        //Probar el extraer dinero
        m.extraerDinero(-100);
        System.out.println(m.getTotal());
        
        //Probar el esta vacio
        System.out.println(m.estaVacio());
        
    }
}