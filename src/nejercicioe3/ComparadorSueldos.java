package nejercicioe3;
import java.util.Comparator;
/**
 *
 * @author Pato-Note
 */
public class ComparadorSueldos implements Comparator<Colaborador> {
    @Override
    public int compare(Colaborador o1, Colaborador o2){
        return o1.getSueldo() - o2.getSueldo();
    }
}
