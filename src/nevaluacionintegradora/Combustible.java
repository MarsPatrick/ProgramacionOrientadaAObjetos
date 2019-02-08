package nevaluacionintegradora;
public abstract class Combustible implements ICalculable{
    
    private short precio;
    
    public short getPrecio(){
        return precio;
    }
    
    public float calcularLitrosCarga(int monto){
        return monto;
    }
}
