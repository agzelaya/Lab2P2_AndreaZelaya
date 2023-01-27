package lab2p2_andreazelaya;


public class Edificio {
    private int pisos;
    private int locales;
    private String direccion;
    private String estado;
    private String owner;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
            
    
    public Edificio(){
        
    }
    
    public Edificio(int pisos, int locales, String direccion, String estado) {
        this.pisos = pisos;
        this.locales = locales;
        this.direccion = direccion;
        this.estado = estado;
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
                + "Estado: " + estado + "\n"
                + "Dueño: " + owner 
                ;
    }
    
    
}
