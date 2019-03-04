package Ejercicio3;
public class Cajero {
    
    private int billetes1000;
    private int billetes2000;

    public int getBilletes1000() {
        return billetes1000;
    }

    public void setBilletes1000(int billetes1000) {
        if(billetes1000>0)
            this.billetes1000 = billetes1000;
    }

    public int getBilletes2000() {
        return billetes2000;
    }

    public void setBilletes2000(int billetes2000) {
        if(billetes2000>0)
            this.billetes2000 = billetes2000;
    }
    
    public int obtenerTotalDinero(){
        return (this.getBilletes1000()*1000)+(this.getBilletes2000()*2000);
    }
    
    public boolean debeRecargar(int limite){
        return (this.getBilletes1000()+this.getBilletes2000())<limite;
    }
    
}