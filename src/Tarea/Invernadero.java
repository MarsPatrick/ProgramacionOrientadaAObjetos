package Tarea;

public class Invernadero {
    
    public Planta buscarPlantaMasAlta(Planta[] plantas){
        Planta p = plantas[0];
        for(int i=0;i<plantas.length;i++){
            if(plantas[i].getAltura()>p.getAltura())
                p=plantas[i];
        }
        return p;
    }
    
    public long consumoAguaTotal(Planta[] plantas){
        long contador=0;
        for(int i = 0; i<plantas.length;i++)
            contador +=plantas[i].getConsumoTotalAgua();
        return contador;
    }
    
    public Planta[] obtenerPlantasQueInicianPor(String iniciaPor, Planta[] plantas){
        int h = 0;
        int j = 0;
        for(int i = 0; i<plantas.length;i++){
            if(plantas[i].getNombre().toLowerCase().startsWith(iniciaPor.toLowerCase())){
               h++;
            }   
        }
        Planta[] arreglo = new Planta[h];
        for(int i = 0; i<plantas.length;i++){
            if(plantas[i].getNombre().toLowerCase().startsWith(iniciaPor.toLowerCase())){
               arreglo[j]=plantas[i];
               j++;
            }   
        }
        return arreglo;
    }
    
    public Planta[] obtenerPlantasConsumoInferiorA(long consumoAgua, Planta[] plantas){
        int c=0;
        for(int i = 0; i<plantas.length;i++){
            if(plantas[i].getConsumoTotalAgua()< consumoAgua)
                c++;
        }
        Planta menor[]=new Planta[c];
        c=0;
        for(int i=0;i<plantas.length;i++){
            if(plantas[i].getConsumoTotalAgua()< consumoAgua){
                menor[c] = plantas[i];
                c++;
            }
        }
        return menor;
    }
    
    public Planta[][] separarTipos(Planta[] plantas){
        Planta[] otra= new Planta[plantas.length];
        for(int i = 0; i<plantas.length;i++){
            otra[i]=plantas[i];
        }
        
        for(int i=0;i<otra.length;i++){
            for(int j=0;j<otra.length;j++){
                if(i!=j){
                    if(otra[i].getTipodePlanta().equalsIgnoreCase(otra[j].getTipodePlanta())){
                        otra[j].setTipodePlanta("");
                    }
                }
            }
        }
        int c=0;
        for (Planta planta : otra) {
            if (!planta.getTipodePlanta().equalsIgnoreCase("")) {
                c++;
            }
        }
        String[] tipo=new String[c];
        int co=0;
        for (Planta planta : otra) {
            if (!planta.getTipodePlanta().equalsIgnoreCase("")){
                tipo[co]=planta.getTipodePlanta();
                co++;
            }
        }
        Planta[][] tipos=new Planta[c][plantas.length];
        Planta x= new Planta("",0,0,"");
        for(int i=0;i<c;i++){
            int con=0;
            for (Planta planta : plantas) {
                if (tipo[i].equalsIgnoreCase(planta.getTipodePlanta())) {
                    tipos[i][con] = planta;
                    con++;
                }
            }
            for(int j=con;j<plantas.length;j++){
                tipos[i][j]=x;
            }
        }
        return tipos;
    }
}