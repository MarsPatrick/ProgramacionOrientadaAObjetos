import java.util.Scanner;
public class Main {
    
    public static void main(String args[]){
        Scanner tc = new Scanner(System.in);
        Empresa em = new Empresa();
        
        //Leer desde teclado los datos de la empresa
        System.out.println("Ingrese los datos para crear una empresa");
        String ne=verificaString("Ingrese nombre de la empresa: ",5);
        
        //Crear la empresa
        boolean crear=false;
        while(crear==false){
            System.out.println("Desea crear empresa (Si|No)");
            String ce=tc.nextLine();
            if(ce.equalsIgnoreCase("si")){
                em.setNombre(ne);
                crear=true;
            }
            if(ce.equalsIgnoreCase("no")){
                return;
            }
        }
        
        //Leer desde teclado un número que representa la cantidad de colaboradores que tendrá la empresa.
        byte cc=(byte)verificaNumero("Ingrese numero de colaboradores",1);
        
        //Agregar algo para que el enter no salte al ingresar rut para que no se repita la linea
        //Leer desde teclado los datos de los colaboradores que se desea agregar a la empresa.
        for(int c=0;c<(int)cc;c++){
            System.out.println("Ingresar datos colaborador N"+(c+1)+":");
            String rut=verificaString("Ingrese rut colaborador");
            if(em.buscarPorRut(rut)){
                System.out.println("Colaborador ya existe");
                c--;
            }else{
                String nc=verificaString("Ingrese nombre del colaborador",3);
                byte ed=(byte)verificaNumero("Ingrese edad del colaborador",0);
                int su=verificaNumero("Ingrese sueldo del colaborador",288000);
                Colaborador col= new Colaborador(rut,nc,ed,su);
                if(em.incorporarColaborador(col)){
                    System.out.println("Colaborador agregado");
                }else{
                    System.out.println("error al agregar");
                    c--;
                }
            }
        }
        
        //Mostrar la lista de colaboradores que hay en la empresa
        System.out.println(em.obtenerListaColaboradores());
        
        //Mostrar la lista de colaboradores cuyo rango de sueldo esta dentro de los limites ingresados por teclado
        System.out.println("Lista de colaboradores por rango");
        int min=verificaNumero("Ingrese minimo",288000);
        int max=verificaNumero("Ingrese maximo",min);
        for(int c=0;c<em.getColaboradores().size();c++){
            Colaborador co=em.getColaboradores().get(c);
            if(co.getSueldo()>=min){
                if(co.getSueldo()<=max){
                    String a=co.getRut().substring(0, co.getRut().length()-1);
                    String b=co.getRut().substring(co.getRut().length()-1);
                    System.out.println("Rut: "+a+"-"+b+" Nombre: "+co.getNombre()+" Edad: "+co.getEdad()+" Sueldo: "+co.getSueldo());
                }
            }
        }
        
        //Leer un rut desde teclado e intentar desvincular al colaborador
        /*
        String rut=verificaString("Ingrese rut a desvincular");
        if(em.buscarPorRut(rut)){
            for(Colaborador uno:em.getColaboradores()){
                if(uno.getRut().equalsIgnoreCase(rut))
                    em.desvincular(uno);
            }
            System.out.println("Colaborador despedido");
        }else{
            System.out.println("No existe el colaborador o ya fue despedido");
        }*/
        
        //Mostrar la lista para verificar que se desvinculo
        System.out.println(em.obtenerListaColaboradores());
        
        //Leer desde teclado un limite de edad y desvincular mediante el motodo
        byte ed=(byte)verificaNumero("Ingrese edad limite",-1);
        em.desvincular(ed);
        
        //Mostrar la lista para verificar la desvinculacion
        System.out.println(em.obtenerListaColaboradores());
    }
    
    public static String verificaString(String palabras,int largo){
        Scanner tc=new Scanner(System.in);
        String x="";
        while(x.length()<largo){
            System.out.println(palabras);
            x=tc.nextLine();
        }
        return x;
    }
    
    public static String verificaString(String palabras){
        Scanner tc=new Scanner(System.in);
        boolean vrut=false;
        String x="";
        while(vrut==false){
            System.out.println(palabras);
            x=tc.nextLine();
            if(x.length()==8||x.length()==9)
                vrut=true;
        }
        return x;
    }
    
    public static int verificaNumero(String palabras,int limite){
        Scanner tc=new Scanner(System.in);
        int x=-1;
        while(x<limite){
            System.out.println(palabras);
            x=tc.nextInt();
        }
        return x;
    }
    
}