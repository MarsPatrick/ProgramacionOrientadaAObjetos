package Ejercicio4;
public class Main {
    public static void main(String[] args) {
        
        //Crear
        Prenda p = new Prenda();
        
        //probar getter y setter Talla
        p.setTalla("S".charAt(0));
        System.out.println(p.getTalla());
        
        //probar getter y setter Precio
        p.setPrecio(1990);
        System.out.println(p.getPrecio());
        
        //probar getter y setter Descripcion
        p.setDescripcion("Polera");
        System.out.println(p.getDescripcion());
        
        //probar valorPagar
        System.out.println(p.valorPagar(10));
    }
}