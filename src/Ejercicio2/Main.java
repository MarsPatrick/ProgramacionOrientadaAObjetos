package Ejercicio2;
public class Main {
    public static void main(String[] args) {
        
        //Crear
        Llamada l = new Llamada();
        
        //Probar get y set numero(Empiece con 9)
        l.setNumeroDestino(98978909);
        System.out.println(l.getNumeroDestino());
        
        //Probar get y set valor(Entre 50 y 270)
        l.setValorMinuto(51);
        System.out.println(l.getValorMinuto());
        
        //Probar get y set duracion(Positivo)
        l.setDuracionMinutos(5);
        System.out.println(l.getDuracionMinutos());
        
        //Probar valor
        System.out.println(l.valorLlamada());
    }
}