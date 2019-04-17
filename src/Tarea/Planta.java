package Tarea;

public class Planta {
    private String nombre;
    private float altura;
    private int consumoTotalAgua;
    private String tipodePlanta;

    public Planta(String nombre, float altura, int consumoTotalAgua, String tipodePlanta) {
        this.nombre = nombre;
        this.altura = altura;
        this.consumoTotalAgua = consumoTotalAgua;
        this.tipodePlanta = tipodePlanta;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public long getConsumoTotalAgua() {
        return consumoTotalAgua;
    }

    public void setConsumoTotalAgua(int consumoTotalAgua) {
        this.consumoTotalAgua = consumoTotalAgua;
    }

    public String getTipodePlanta() {
        return tipodePlanta;
    }

    public void setTipodePlanta(String tipodePlanta) {
        this.tipodePlanta = tipodePlanta;
    }
    
}
