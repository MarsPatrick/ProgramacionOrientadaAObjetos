import java.util.Scanner;
public class Main {
    
    public static void main(String args[]){
        Scanner tc = new Scanner(System.in);
        Empresa em = new Empresa();
        System.out.println("Ingrese los datos para crear una empresa");
        String ne="";
        while(ne.length()<5){
            System.out.println("Ingrese nombre de la empresa: ");
            ne=tc.nextLine();
        }
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
        byte cc=0;
        while(cc<1){
            System.out.println("Ingrese cantidad de colaboradores que tendra la empresa");
            cc=tc.nextByte();
        }
        //Agregar algo para que el enter no salte al ingresar rut para que no se repita la linea
        for(int c=0;c<(int)cc;c++){
            System.out.println("Ingresar datos colaborador N"+(c+1)+":");
            boolean vrut=false;
            String rut="";
            while(vrut==false){
                System.out.println("Ingrese rut del colaborador");
                rut=tc.nextLine();
                if(rut.length()==8||rut.length()==9){
                    vrut=true;
                }
            }
            if(em.buscarPorRut(rut)){
                System.out.println("Colaborador ya existe");
                c--;
            }else{
                String no="";
                while(no.length()<3){
                    System.out.println("Ingrese nombre colaborador");
                    no=tc.nextLine();
                }
                byte ed=-1;
                while(ed<0){
                    System.out.println("Ingrese edad colaborador");
                    ed=tc.nextByte();
                }
                int su=0;
                while(su<288000){
                    System.out.println("Ingrese sueldo colaborador");
                    su=tc.nextInt();
                }
                Colaborador col= new Colaborador(rut,no,ed,su);
                if(em.incorporarColaborador(col)){
                    System.out.println("Colaborador agregado");
                }else{
                    System.out.println("error al agregar");
                    c--;
                }
            }
        }
        System.out.println("Colaboradores:");
        for(int c=0;c<em.getColaboradores().size();c++){
            Colaborador co=em.getColaboradores().get(c);
            String a=co.getRut().substring(0, co.getRut().length()-1);
            String b=co.getRut().substring(co.getRut().length()-1);
            System.out.println("Rut: "+a+"-"+b+" Nombre: "+co.getNombre()+" Edad: "+co.getEdad()+" Sueldo: "+co.getSueldo());
        }
        System.out.println("Lista de colaboradores por rango");
    }
}