package Tarea;
public class main {
    public static void main(String[] args){
        Invernadero g=new Invernadero();
        Planta[] plantas=new Planta[]{
            new Planta ("carnívora",1.05f, 160,"montaña"),
            new Planta ("rosa",0.90f, 168,"lago"),
            new Planta ("Clavel",0.52f, 456, "selva"),
            new Planta ("carnívoradora",1.05f, 160,"montaña"),
            new Planta ("rosamel",0.90f, 168,"lago"),
            new Planta ("carnívora",1.05f, 160,"montaña"),
            new Planta ("rosado",0.90f, 168,"lago"),
            new Planta ("Clavelo",0.52f, 456, "selva"),
            new Planta ("carnívorador",1.05f, 160,"montaña"),
            new Planta ("rosamelo",0.90f, 168,"lago"),
            new Planta ("Clave",0.52f, 456, "selva")
        };
        
        //Buscar Planta mas alta
        Planta alta = g.buscarPlantaMasAlta(plantas);
        System.out.println(alta.getNombre()+" "+alta.getAltura());
        System.out.println("");
        
        //Consumo total
        System.out.println("el total de consumo de agua es = " + g.consumoAguaTotal(plantas)); 
        System.out.println("");
        
        //Plantas por letra
        String inicia="r";
        Planta[] t = g.obtenerPlantasQueInicianPor(inicia, plantas);
        System.out.println("Plantas que inician por "+inicia);
        for(int i=0;i<t.length;i++)
            System.out.println(t[i].getNombre());
        System.out.println("");
        
        //Plantas por consumo
        long consumo=200;
        Planta[] x = g.obtenerPlantasConsumoInferiorA(consumo, plantas);
        for(int i =0; i<x.length;i++)
            System.out.println(x[i].getNombre()+"consume menos a: "+consumo);
        System.out.println("");
        
        //Separar tipos
        Planta[][] separar = g.separarTipos(plantas);
        for(int i=0;i<separar.length;i++){
            for(int j = 0;j<separar[0].length;j++){
                if(separar[i][j]!=null){
                    System.out.print(" ["+separar[i][j].getNombre()+"] ");
                }
            }
            System.out.println("");
        }
    }
}