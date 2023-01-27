package lab2p2_andreazelaya;

import java.util.Scanner;


public class Lab2P2_AndreaZelaya {
static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("INMOBILIARIA BLACK FLOYD\n\n");
        int opc;
        do{
            System.out.println("Menu:\n"
                    + "1. Registro de Inmueble/solar\n"
                    + "2. Manejo de estados\n"
                    + "3. Log in/Sign up\n"
                    + "4. Salir\n"
                    + "Ingrese la opción que desea usar: ");
            opc = in.nextInt();
            
            switch(opc){
                case 1:{
                    break;
                }
                case 2:{
                    break;
                }
                
                case 3:{
                    System.out.println("LOG IN/SIGN UP");
                    break;
                }
                
                case 4:{
                    break;
                }
                
            }
        }while(opc != 4);
    }
    
}
