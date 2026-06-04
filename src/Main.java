import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion;
        do{
            System.out.println("=========================");
            System.out.println("   REGISTRO DE USUARIOS  ");
            System.out.println("=========================");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    SistemaUsuario sistemaUsuario = new SistemaUsuario();
                    sistemaUsuario.registrarUsuario(sc);
                    break;
                case 2:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 2);
    }
}