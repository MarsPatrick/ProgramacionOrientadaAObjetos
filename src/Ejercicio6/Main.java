package Ejercicio6;
public class Main {
    public static void main(String[] args) {
        
        //Crear
        Punto p = new Punto();
        
        //Probar getter y setter X
        p.setX(1);
        System.out.println(p.getX());
        
        //Probar getter y setter Y
        p.setY(1);
        System.out.println(p.getY());
        
        //Probar desplazar X
        p.desplazarEjeX(-2);
        System.out.println(p.getX());

        //Probar desplazar Y
        p.desplazarEjeY(2);
        System.out.println(p.getY());
        
        //Probar obtener cuadrante
        System.out.println(p.obtenerCuadrante());
    }
}