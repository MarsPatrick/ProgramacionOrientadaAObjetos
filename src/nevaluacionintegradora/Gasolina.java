package nevaluacionintegradora;
public class Gasolina extends Combustible{
    
    private byte octanaje;
    
    public Gasolina(byte octanaje){
        this.octanaje=octanaje;
    }

    @Override
    public float calcularLitroCarga(int monto) {
        if(this.octanaje==93){
           return monto/ICalculable.p93;
        }
        if(this.octanaje==97){
           return monto/ICalculable.p97; 
        }
        return monto/ICalculable.p95;
    }
}
