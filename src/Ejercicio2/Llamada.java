package Ejercicio2;
public class Llamada {
    
    private int numeroDestino;
    private int valorMinuto;
    private int duracionMinutos;

    public int getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(int numeroDestino) {
        if(Integer.toString(numeroDestino).startsWith("9"))
            this.numeroDestino = numeroDestino;
    }

    public int getValorMinuto() {
        return valorMinuto;
    }

    public void setValorMinuto(int valorMinuto) {
        if(valorMinuto>50&&valorMinuto<270)
            this.valorMinuto = valorMinuto;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        if(duracionMinutos>0)
            this.duracionMinutos = duracionMinutos;
    }
    
    public int valorLlamada(){
        return this.valorMinuto*this.duracionMinutos;
    }
    
}
