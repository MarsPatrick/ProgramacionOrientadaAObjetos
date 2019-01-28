/**
 *
 * @author Pato-Note
 */
public class Punto {
    
    private byte x;
    private byte y;
    
    public Punto(byte x,byte y){
        this.x=x;
        this.y=y;
    }

    public byte getX() {
        return x;
    }

    public byte getY() {
        return y;
    }
    
    public void desplazarEjeX(byte delta){
        this.x= (byte)(x + delta);
    }
    
    public void desplazarEjeY(byte delta){
        this.y= (byte)(y + delta);
    }
    
}
