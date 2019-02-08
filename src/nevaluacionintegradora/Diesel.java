package nevaluacionintegradora;
public class Diesel extends Combustible {
    
    public Diesel(){
    }
    @Override
    public float calcularLitroCarga(int monto) {
        return monto/ICalculable.pD;
    }

}
