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
            if(x.getRut().equals(rut))
                return true;
        }
        return false;
    }
    
    public boolean incorporarColaborador(Colaborador c){
        if(buscarPorRut(c.getRut()))
            return false;
        colaboradores.add(c);
        return true;
    }
    
    public ArrayList<Colaborador> buscarColaboradoresPorSueldo(int minimo,int maximo){
        ArrayList<Colaborador> x = new ArrayList();
        for(Colaborador c:colaboradores){
            if(c.getSueldo()>minimo && c.getSueldo()<maximo)
                    x.add(c);
        }
        return x;
    }
    
    public boolean desvincular(Colaborador despedido){
        int x=0;
        if(this.buscarPorRut(despedido.getRut())){
            for(int i=0;i<this.getColaboradores().size();i++){
                if(this.getColaboradores().get(i).getRut().equalsIgnoreCase(despedido.getRut()))
                    x=i;
            }
            this.getColaboradores().remove(x);
            return true;
        }
        return false;
    }
    
    public int desvincular(byte limiteEdad){
        int i=0;
        for(int c=0;c<this.getColaboradores().size();c++){
            if(this.getColaboradores().get(c).getEdad()<limiteEdad){
                this.desvincular(this.getColaboradores().get(c));
                i++;
            }
        }
        return i;
    }
    
    public void cambiarSueldos(float porcentajes){
        for(Colaborador uno:colaboradores)
            uno.setSueldo((int)(uno.getSueldo()*porcentajes)+uno.getSueldo());
    }
    
    public String obtenerListaColaboradores(){
        String x="Colaboradores:";
        for(Colaborador algun:colaboradores){
            String a=algun.getRut().substring(0, algun.getRut().length()-1);
            String b=algun.getRut().substring(algun.getRut().length()-1);
            x=x+"\nRut: "+a+"-"+b;
            x=x+" Nombre: "+algun.getNombre();
            x=x+" Edad: "+algun.getEdad();
            x=x+" Sueldo: "+algun.getSueldo();
        }
        return x;
    }
}