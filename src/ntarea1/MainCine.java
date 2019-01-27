package ntarea1;
import java.util.Scanner;
/**
 *
 * @author Pato-Note
 */
public class MainCine {
    
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        boolean salir = false;
        int opcion,x,con,cinecreado=0;
        String y;
        Cine c = new Cine("");
        
        System.out.println("\nBienvenido");
        while(!salir){
            System.out.println("1.Crear cine");
            System.out.println("2.Vender entradas");
            System.out.println("3.Ver ocupación de sala");
            System.out.println("4.Ver ocupación de sala por rango de filas");
            System.out.println("5.Obtener informe de recaudación");
            System.out.println("6.Mostrar datos de cine");
            System.out.println("7.Agregar nueva sala");
            System.out.println("8.Salir");
            System.out.println("Elija una de las opciones");
            opcion = t.nextInt();
            if(cinecreado==0){
                switch(opcion){
                    case 1:
                        System.out.println("\nUsted a elegido crear cine");
                        System.out.println("ingrese nombre del cine");
                        c.setNombre(t.next());
                        System.out.println("Ingrese cantidad de salas");
                        x=t.nextInt();
                        for(con=0;con<=x;con++){
                            String nom;
                            byte fil,col;
                            short val;
                            System.out.println("Sala "+(con+1));
                            System.out.println("Ingrese nombre");
                            nom=t.next();
                            System.out.println("Ingrese cantidad de filas");
                            fil=t.nextByte();
                            System.out.println("Ingrese cantidad de columnas");
                            col=t.nextByte();
                            System.out.println("Ingrese valor de la entrada");
                            val=t.nextShort();
                            Asiento asiento[][]= null;
                            for(int j=0;j<fil;j++){
                                char a=(char) ('a'+j);
                                for(int f=0;f<col;f++){
                                    Asiento n= new Asiento();
                                    n.setFila(a);
                                    n.setColumna((byte) f);  
                                }              
                            }             
                            Sala s = new Sala(nom,fil,asiento,col,val);    
                            if(c.agregarSala(s)==true)
                            System.out.println("Felicidades sala "+con+"completa");          
                        };
                        cinecreado=1;
                        break;
                    case 8:
                        System.out.println("\nEsta por salir");
                        salir = true;
                        break;
                    default:
                        System.out.println("\nDebe crear cine");
                }
            }else{   
                switch(opcion){  
                    case 1:
                        System.out.println("\nCine ya fue creado");
                        break;
                    case 2:
                        System.out.println("\nUsted a elegido vender entradas");
                        System.out.println("Ingrese cantidad de entradas:");
                        x = t.nextInt();
                        System.out.println("Ingrese Sala:");
                        y = t.next();
                        for(int i=0;i<x;i++){
                            System.out.println("\nEliga asientos");
                            System.out.println(c.buscaSalaPorNombre(y).mostrarOcupacion());
                        }
                        break;
                    case 3:
                        System.out.println("\nUsted a elegido ver ocupacion de salas");
                        break;
                    case 4:
                        System.out.println("\nUsted a elegido ver ocupacion de sala por rango de filas");
                        break;
                    case 5:
                        System.out.println("\nUsted a elegido obtener informe de recaudacion");
                        break;
                    case 6:
                        System.out.println("\nUsted a elegido mostrar datos de cine");
                        break;
                    case 7:
                        System.out.println("\nUsted a elegido agregar nueva sala");
                        break;
                    case 8:
                        System.out.println("\nEsta por salir");
                        salir = true;
                        break;
                    default:
                        System.out.println("\nElegir numeros entre 1 y 8");
                }
            }
        }
    }
    
    /*public static boolean validaAsiento(Sala s, String a){
        
    }*/
}
