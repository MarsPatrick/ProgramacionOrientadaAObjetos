package nevaluacionintegradora;

public class Carga {
    
    private Combustible tipo;
    private float litros;
    private int monto;
    
    public Carga(Combustible tipo,int monto){
        this.tipo=tipo;
        this.monto=monto;
    }
    
    public String toString(){
        return "";
    }
    
    public Combustible getTipo(){
        return tipo;
    }
    
    public float getLitros(){
        return tipo.calcularLitroCarga(monto);
    }
    
    public int getMonto(){
        return monto;
    }
}
