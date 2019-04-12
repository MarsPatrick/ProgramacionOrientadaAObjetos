package Ejercicio6;
public class Punto {
    
    private float x;
    private float y;

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    
    public void desplazarEjeX(float delta){
        this.x=this.getX()+delta;
    }
    
    public void desplazarEjeY(float delta){
        this.y=this.getY()+delta;
    }
    
    public int obtenerCuadrante(){
        if(this.getX()>0){
            if(this.getY()>0){
                return 1;
            }
            if(this.getY()<0){
                return 4;
            }
        }
        if(this.getX()<0){
            if(this.getY()>0){
                return 2;
            }
            if(this.getY()<0){
                return 3;
            }
        }
        return 0;
    }
    
}
