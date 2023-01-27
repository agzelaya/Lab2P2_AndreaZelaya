package lab2p2_andreazelaya;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Lab2P2_AndreaZelaya {

    static Scanner in = new Scanner(System.in);
    static ArrayList lista = new ArrayList();
    static ArrayList<Usuario> users = new ArrayList();

    //variables para manejo de cuenta
    static boolean isAdmin = false;
    static String username = "null";

    public static void main(String[] args) {
        Usuario admin = new Usuario("Admin",0,"admin","admin1234");
        users.add(admin);
        
        System.out.println("INMOBILIARIA BLACK FLOYD\n\n");
        int opc;
        do {
            System.out.println("Menu:\n"
                    + "1. Registro de Inmueble/Solar\n"
                    + "2. Manejo de estados\n"
                    + "3. Log in/Sign up\n"
                    + "4. Log out\n"
                    + "5. Salir\n"
                    + "Ingrese la opción que desea usar: ");
            opc = in.nextInt();

            switch (opc) {
                case 1: {
                    System.out.println("\nREGISTRO");
                    Registro();
                    break;
                }
                case 2: {
                    System.out.println("\nMANEJO DE ESTADOS");
                    manejoEstados();
                    break;
                }

                case 3: {
                    System.out.println("\nLOG IN/SIGN UP\n"
                            + "1. Crear nueva cuenta\n"
                            + "2. Ingresar a cuenta existente");
                    int opcAcc = in.nextInt();
                    
                    switch(opcAcc){
                        case 1:{
                            signUp();
                            break;
                        }
                        
                        case 2:{
                            logIn();
                            System.out.println(isAdmin);
                            break;
                        }
                    }
                    
                    break;
                }

                case 4: {
                    boolean isAdmin = true;
                    String username = "null";
                    System.out.println("Log out exitoso\n");
                    break;
                }

            }
        } while (opc != 5);
    }

    public static void Registro() {
        int opc;
        do {
            System.out.println("1. Crear casas/edificios/solares\n"
                    + "2. Listar casas/edificios/solares\n"
                    + "3. Modificar casas/edificios/solares\n"
                    + "4. Borrar casas/edificios/solares\n"
                    + "5. Comprar casas/edificios/solares\n"
                    + "6. Regresar a menu principal\n"
                    + "Ingrese la opcion que desea usar: ");
            opc = in.nextInt();

            switch (opc) {
                case 1: {
                    if(isAdmin == false){
                        System.out.println("Acceso denegado");
                        break;
                    }
                    int opc2;
                    System.out.println("Crear un nuevo:\n"
                            + "1. Casa\n"
                            + "2. Edificio\n"
                            + "3. Solar\n");
                    opc2 = in.nextInt();

                    switch (opc2) {
                        case 1: {
                            System.out.println("Ingrese el numero de casa: ");
                            int numcasa = in.nextInt();

                            System.out.println("Ingrese el numero de bloque: ");
                            int numblo = in.nextInt();

                            Color color = JColorChooser.showDialog(null, "Seleccione color", Color.WHITE);

                            System.out.println("Ingrese el ancho de la casa: ");
                            int ancho = in.nextInt();

                            System.out.println("Ingrese el largo de casa: ");
                            int largo = in.nextInt();

                            System.out.println("Ingrese el numero de baños: ");
                            int bathrooms = in.nextInt();

                            System.out.println("Ingrese el numero de cuartos: ");
                            int rooms = in.nextInt();

                            System.out.println("Ingrese el estado de la casa: ");
                            in.next();
                            String estado = in.nextLine();

                            Casa casa = new Casa(numcasa, numblo, color, ancho, largo, bathrooms, rooms, estado);
                            lista.add(casa);
                            break;
                        }
                        case 2: {
                            System.out.println("Ingrese el numero de pisos: ");
                            int pisos = in.nextInt();

                            System.out.println("Ingrese la cantidad de locales: ");
                            int locales = in.nextInt();

                            System.out.println("Ingrese la direccion por referencia: ");
                            in.next();
                            String direccion = in.nextLine();

                            System.out.println("Ingrese el estado de la casa: ");
                            in.next();
                            String estado = in.nextLine();

                            Edificio edificio = new Edificio(pisos, locales, direccion, estado);
                            lista.add(edificio);
                            break;
                        }
                        case 3: {
                            System.out.println("Ingrese el ancho: ");
                            int ancho = in.nextInt();

                            System.out.println("Ingrese el largo: ");
                            int largo = in.nextInt();

                            System.out.println("Ingrese el estado de la casa: ");
                            in.next();
                            String estado = in.nextLine();

                            Solar solar = new Solar(ancho, largo, estado);
                            lista.add(solar);
                            break;
                        }
                        default: {
                            System.out.println("Opcion ingresada no es valida");
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Listar: \n"
                            + "1. Todo\n"
                            + "2. Casas\n"
                            + "3. Edificios\n"
                            + "4. Solares");
                    int opc3 = in.nextInt();
                    switch (opc3) {
                        case 1: {
                            String salida = "";
                            for (Object t : lista) {
                                salida += "" + lista.indexOf(t) + " - " + t + "\n";

                            }
                            System.out.println(salida);
                            break;

                        }
                        case 2: {
                            String salida = "";
                            for (Object t : lista) {
                                if (t instanceof Casa) {
                                    salida += "" + lista.indexOf(t) + " - " + t + "\n";
                                }
                            }
                            System.out.println(salida);
                            break;
                        }
                        case 3: {
                            String salida = "";
                            for (Object t : lista) {
                                if (t instanceof Edificio) {
                                    salida += "" + lista.indexOf(t) + " - " + t + "\n";
                                }
                            }
                            System.out.println(salida);
                            break;
                        }

                        case 4: {
                            String salida = "";
                            for (Object t : lista) {
                                if (t instanceof Solar) {
                                    salida += "" + lista.indexOf(t) + " - " + t + "\n";
                                }
                            }
                            System.out.println(salida);
                            break;
                        }
                        default: {
                            System.out.println("Opcion ingresada no es valida");
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("Ingrese el índice a modificar");
                    int pos = in.nextInt();

                    if (pos >= 0 & pos < lista.size()) {
                        if (lista.get(pos) instanceof Casa) {
                            System.out.println("Cual atributo desea modificar?:\n"
                                    + "1. Numero de casa\n"
                                    + "2. Numero de bloque\n"
                                    + "3. Color\n"
                                    + "4. Ancho\n"
                                    + "5. Largo\n"
                                    + "6. Numero de baños\n"
                                    + "7. Numero de cuartos\n");
                            int atr = in.nextInt();

                            switch (atr) {
                                case 1: {
                                    System.out.println("Ingrese el numero de casa: ");
                                    int numcasa = in.nextInt();
                                    ((Casa) lista.get(pos)).setNum_casa(numcasa);
                                    break;
                                }

                                case 2: {
                                    System.out.println("Ingrese el numero de bloque: ");
                                    int numblo = in.nextInt();
                                    ((Casa) lista.get(pos)).setNum_bloque(numblo);
                                    break;
                                }

                                case 3: {
                                    Color color = JColorChooser.showDialog(null, "Seleccione color", Color.WHITE);
                                    ((Casa) lista.get(pos)).setColor(color);
                                }

                                case 4: {
                                    System.out.println("Ingrese el ancho de la casa: ");
                                    int ancho = in.nextInt();
                                    ((Casa) lista.get(pos)).setAncho(ancho);
                                    break;
                                }

                                case 5: {
                                    System.out.println("Ingrese el largo de la casa: ");
                                    int largo = in.nextInt();
                                    ((Casa) lista.get(pos)).setLargo(largo);
                                    break;
                                }

                                case 6: {
                                    System.out.println("Ingrese el numero de cuartos: ");
                                    int rooms = in.nextInt();
                                    ((Casa) lista.get(pos)).setRooms(rooms);
                                    break;
                                }

                                case 7: {
                                    System.out.println("Ingrese el numero de bloque: ");
                                    int numblo = in.nextInt();
                                    ((Casa) lista.get(pos)).setNum_bloque(numblo);
                                    break;
                                }
                                default: {
                                    System.out.println("Opcion no valida");
                                }

                            }
                        } else if (lista.get(pos) instanceof Edificio) {
                            System.out.println("Cual atributo desea modificar?:\n"
                                    + "1. Numero de pisos\n"
                                    + "2. Cantidad de locales\n"
                                    + "3. Dirección por referencia");
                            int atr = in.nextInt();

                            switch (atr) {
                                case 1: {
                                    System.out.println("Ingrese el numero de pisos: ");
                                    int pisos = in.nextInt();
                                    ((Edificio) lista.get(pos)).setPisos(pisos);
                                    break;
                                }
                                case 2: {
                                    System.out.println("Ingrese el cantidad de locales: ");
                                    int locales = in.nextInt();
                                    ((Edificio) lista.get(pos)).setLocales(locales);
                                    break;
                                }
                                case 3: {
                                    System.out.println("Ingrese la direccion por referencia: ");
                                    in.nextLine();
                                    String direc = in.nextLine();
                                    ((Edificio) lista.get(pos)).setDireccion(direc);
                                    break;
                                }
                                default: {
                                    System.out.println("Opcion no valida");
                                }
                            }
                        } else if (lista.get(pos) instanceof Solar) {
                            System.out.println("Cual atributo desea modificar?\n"
                                    + "1. Ancho\n"
                                    + "2. Largo\n");
                            int atr = in.nextInt();

                            switch (atr) {
                                case 1: {
                                    System.out.println("Ingrese el ancho: ");
                                    int ancho = in.nextInt();
                                    ((Solar) lista.get(pos)).setAncho(ancho);
                                    break;
                                }
                                case 2: {
                                    System.out.println("Ingrese el largo: ");
                                    int largo = in.nextInt();
                                    ((Solar) lista.get(pos)).setLargo(largo);
                                    break;
                                }
                                default: {
                                    System.out.println("Opcion no valida");
                                }

                            }

                        }
                    } else {
                        System.out.println("La posicion entregada no es valida");
                    }

                    break;
                }
                case 4: {
                    String salida = "";
                    for (Object t : lista) {
                        salida += "" + lista.indexOf(t) + " - " + t + "\n";

                    }
                    System.out.println(salida + "\n\n");
                    System.out.println("Ingrese el indice del inmueble o solar a eliminar");
                    int elim = in.nextInt();
                    if (elim >= 0 & elim < lista.size()) {
                        lista.remove(elim);
                        System.out.println("");
                    } else {
                        System.out.println("La posicion entregada no es valida");
                    }
                    break;
                }
                case 5: {
                    String salida = "";
                    for (Object t : lista) {
                        salida += "" + lista.indexOf(t) + " - " + t + "\n";

                    }
                    System.out.println(salida);

                    System.out.println("Ingrese el indice del inmueble o solar a comprar");
                    int vent = in.nextInt();
                    if (vent >= 0 & vent < lista.size()) {
                        if (lista.get(vent) instanceof Casa) {
                            ((Casa) lista.get(vent)).setOwner(username);
                        } else if (lista.get(vent) instanceof Edificio) {
                            ((Edificio) lista.get(vent)).setOwner(username);
                        } else if (lista.get(vent) instanceof Solar) {
                            ((Solar) lista.get(vent)).setOwner(username);
                        }

                    } else {
                        System.out.println("La posicion entregada no es valida");
                    }
                    break;
                }
            }

        } while (opc != 6);
    }

    public static void manejoEstados() {
        String salida = "";
        for (Object t : lista) {
            salida += "" + lista.indexOf(t) + " - " + t + "\n";

        }
        System.out.println(salida + "\n\n");
        System.out.println("Ingrese el indice de el inmoviliario a modificar el estado:");
        int pos = in.nextInt();

        if (pos >= 0 & pos < lista.size()) {
            System.out.println("Ingrese el nuevo estado: ");
            in.next();
            String estado = in.nextLine();

            if (lista.get(pos) instanceof Casa) {
                ((Casa) lista.get(pos)).setEstado(estado);
            } else if (lista.get(pos) instanceof Edificio) {
                ((Edificio) lista.get(pos)).setEstado(estado);
            } else if (lista.get(pos) instanceof Solar) {
                ((Solar) lista.get(pos)).setEstado(estado);
            }

        } else {
            System.out.println("Indice no valido");
        }
    }
    
    public static void signUp(){
        System.out.println("Nombre: ");
        in.next();
        String name = in.nextLine();
        username = name;
        isAdmin = false;
        
        System.out.println("Edad: ");
        int age = in.nextInt();
        
        System.out.println("Username: ");
        String user = in.next();
        
        System.out.println("Contraseña: ");
        String password = in.next();
        
        Usuario u = new Usuario(name, age, user, password);
        users.add(u);
    }
    
    public static void logIn(){
        System.out.println("Ingrese el nombre de cuenta: ");
        //in.next();
        String cuenta = in.next();
        
        System.out.println("Ingrese la contraseña: ");
        String contra = in.next();
        
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getUsername().equals(cuenta) && users.get(i).getPassword().equals(contra)){
                username = users.get(i).getNombre();
                isAdmin = false;
            }else{
                System.out.println("Nombre de cuenta o contraseña incorrecta\n\n");
            }
        }
        
        if(cuenta.equals("admin") && contra.equals("admin1234")){
            username = "Admin";
            isAdmin = true;
        }
    }
}
