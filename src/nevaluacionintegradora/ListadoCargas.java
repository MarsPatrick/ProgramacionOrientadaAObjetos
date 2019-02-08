package nevaluacionintegradora;

import java.util.ArrayList;

public class ListadoCargas {
    
    private ArrayList<Carga> registro;
    
    public ListadoCargas(){
        this.registro=new ArrayList();
    }
    
    public int totalRegistros(){
        return registro.size();
    }
    
    public void agregarCarga(Carga nueva){
        registro.add(nueva);
    }
    
    public ArrayList<Carga> getRegistro(){
        return registro;
    }
    
}
