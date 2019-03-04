package Ejercicio5;
public class Fraccion {
    
    private int numerador;
    private int denominador;

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        if(denominador!=0)
            this.denominador = denominador;
    }
    
    public boolean esSimplificable(){
        return true;
    }
    
}
