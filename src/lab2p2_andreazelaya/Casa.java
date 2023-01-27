package lab2p2_andreazelaya;

import java.awt.Color;


public class Casa {
    private int num_casa;
    private int num_bloque;
    private Color color;
    private int ancho;
    private int largo;
    private int bathroom;
    private int rooms;
    
    public Casa(){
        
    }
    
    public Casa(int num_casa, int num_bloque, Color color, int ancho, int largo, int bathroom, int rooms) {
        this.num_casa = num_casa;
        this.num_bloque = num_bloque;
        this.color = color;
        this.ancho = ancho;
        this.largo = largo;
        this.bathroom = bathroom;
        this.rooms = rooms;
    }

    public int getNum_casa() {
        return num_casa;
    }

    public void setNum_casa(int num_casa) {
        this.num_casa = num_casa;
    }

    public int getNum_bloque() {
        return num_bloque;
    }

    public void setNum_bloque(int num_bloque) {
        this.num_bloque = num_bloque;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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

    public int getBathroom() {
        return bathroom;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
    
    @Override
    public String toString(){
        return "Numero de casa: " + num_casa + "\n" +
                "Numero de bloque: " + num_bloque + "\n" +
                "Color: " + color + "\n"+
                "Ancho: " + ancho + "\n" +
                "Largo: " + largo + "\n" +
                "Numero de baños: " + bathroom + "\n"+
                "Numero de cuartos: " + rooms ;
    }
}
