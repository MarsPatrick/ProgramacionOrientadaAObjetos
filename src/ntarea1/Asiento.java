package ntarea1;
/**
 *
 * @author Pato-Note
 */
public class Asiento {
    
    private char fila;
    private byte columna;
    private boolean libre;

    public Asiento(char fila, byte columna) {
        this.fila = fila;
        this.columna = columna;
    }
    
    public Asiento(){
    }
    
    public char getFila(){
        return this.fila;
    }

    public void setFila(char fila) {
        this.fila = fila;
    }

    public byte getColumna() {
        return columna;
    }

    public void setColumna(byte columna) {
        this.columna = columna;
    }
    
    
    public boolean isLibre(){
        return libre;
    }
    
    public void setLibre(boolean libre){
        this.libre= libre;
    }
    
    public String mostrarDatos(){
        return "Asiento: ("+this.getFila()+","+this.getColumna()+")"+"\nDisponibilidad: "+this.isLibre();
    }
}
