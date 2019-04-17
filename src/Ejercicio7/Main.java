package Ejercicio7;
public class Main {
    public static void main(String[] args) {

        //Crear
        Alimento a = new Alimento();
        
        //Probar getter y setter Nombre
        a.setNombre("Hamburguesa");
        System.out.println(a.getNombre());
        
        //Probar getter y setter Calorias
        a.setCalorias(260);
        System.out.println(a.getCalorias());
        
        //Probar metodo obtenerTotalCalorias
        System.out.println(a.obtenerTotalCalorias(2));
        
        //Probar metodo esAltoEnCalorias
        System.out.println(a.esAltoEnCalorias());
    }
}