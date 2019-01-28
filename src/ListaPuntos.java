import java.util.ArrayList;
/**
 *
 * @author Pato-Note
 */
public class ListaPuntos {
    
    private ArrayList<Punto> puntos;
    
    public ListaPuntos(){
        this.puntos = new ArrayList();
    }
    
    public boolean agregarPunto(Punto p){
        puntos.add(p);
        return true;
    }
    
    public int totalPuntos(){
        return puntos.size();
    }
    
    public Punto buscarPorIndice(int index){
        return puntos.get(index);
    }
}
