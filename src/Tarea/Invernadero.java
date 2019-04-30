package Tarea;

public class Invernadero {
    
    public Planta buscarPlantaMasAlta(Planta[] plantas){
        Planta p = plantas[0];
        for(Planta x : plantas){
            if(x.getAltura()>p.getAltura())
                p=plantas[i];
        }
        return p;
    }
    
    public long consumoAguaTotal(Planta[] plantas){
        long contador=0;
        for(Planta x : plantas)
            contador +=x.getConsumoTotalAgua();
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
        String[] otra= new String[plantas.length];
        
        for(int i = 0; i<plantas.length;i++){
            otra[i]=plantas[i].getTipodePlanta();
        }
        
        for(int i=0;i<otra.length;i++){
            for(int j=0;j<otra.length;j++){
                if(i!=j){
                    if(otra[i].equalsIgnoreCase(otra[j]))
                        otra[j]=("");
                }
            }
        }
        
        int c=0;
        for (String x : otra) {
            if (!x.equalsIgnoreCase(""))
                c++;
        }
        
        String[] tipo=new String[c];
        int co=0;
        for (String x : otra) {
            if (!x.equalsIgnoreCase("")){
                tipo[co]=x;
                co++;
            }
        }
        
        Planta[][] tipos=new Planta[c][plantas.length];
        for(int i=0;i<c;i++){
            int con=0;
            for (Planta planta : plantas) {
                if (planta.getTipodePlanta().equalsIgnoreCase(tipo[i])) {
                    tipos[i][con] = planta;
                    con++;
                }
            }
        }
        
        return tipos;
        
    }
}