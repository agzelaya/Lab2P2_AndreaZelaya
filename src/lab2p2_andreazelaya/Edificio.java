package lab2p2_andreazelaya;


public class Edificio {
    private int pisos;
    private int locales;
    private String direccion;
    
    public Edificio(){
        
    }
    
    public Edificio(int pisos, int locales, String direccion) {
        this.pisos = pisos;
        this.locales = locales;
        this.direccion = direccion;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getLocales() {
        return locales;
    }

    public void setLocales(int locales) {
        this.locales = locales;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString(){
        return "Cantidad de pisos: " + pisos + "\n" +
                "Cantidad de locales: " + locales + "\n" +
                "Direccion por referencia: " + direccion + "\n"
                ;
    }
    
    
}
