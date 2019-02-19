import java.util.ArrayList;
public class Empresa {
    
    private String nombre;
    private ArrayList<Colaborador> colaboradores;
    
    public Empresa(){
        this.colaboradores= new ArrayList();
    }
    
    public String getNombre(){
        return this.nombre;
    }

    public ArrayList<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean buscarPorRut(String rut){
        for(Colaborador x:colaboradores){
            if(x.getRut().equals(rut)){
                return true;
            }
        }
        return false;
    }
    
    public boolean incorporarColaborador(Colaborador c){
        if(buscarPorRut(c.getRut())){
            return false;
        }
        colaboradores.add(c);
        return true;
    }
    
    public ArrayList<Colaborador> buscarColaboradoresPorSueldo(int minimo,int maximo){
        ArrayList<Colaborador> x = new ArrayList();
        for(Colaborador c:colaboradores){
            if(c.getSueldo()>minimo){
                if(c.getSueldo()<maximo){
                    x.add(c);
                }
            }
        }
        return x;
    }
    
}