package Ejercicio3;
public class Main {
    public static void main(String[] args) {
        
        //Crear
        Cajero c = new Cajero();
        
        //Probar set y get billetes 1000
        c.setBilletes1000(-11);
        System.out.println(c.getBilletes1000());
        
        //Probar set y get billetes 2000
        c.setBilletes2000(1);
        System.out.println(c.getBilletes2000());
        
        //Probar obtener dinero
        System.out.println(c.obtenerTotalDinero());
        
        //Probar debe recargar
        System.out.println(c.debeRecargar(3));
    }
}