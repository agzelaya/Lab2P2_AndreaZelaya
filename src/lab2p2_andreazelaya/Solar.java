package lab2p2_andreazelaya;


public class Solar {
    private int ancho;
    private int largo;
    private int area;

    private String owner;
    
    public Solar(){
        
    }

    public Solar(int ancho, int largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    @Override
    public String toString(){
        return "\nSOLAR\n"+ "Ancho: " + ancho + "\n" +
                "Largo: " + largo + "\n" +
                "Area: " + (ancho*largo) + "\n" +
                "Dueño: " + owner + "\n";
        
    }
    
    
          
}
