import java.util.*;

public class SistemaUsuario {
    private List<Usuario> usuarios;

    public SistemaUsuario() {
        this.usuarios = new ArrayList<>();
    }

    public void registrarUsuario(Scanner sc) {
        System.out.print("Ingrese el nombre del usuario: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la edad del usuario: ");
        int edad = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Ingrese el correo electrónico del usuario: ");
        String correoElectronico = sc.nextLine();

        System.out.print("Ingrese el salario mensual del usuario: ");
        double salarioMensual = sc.nextDouble();
        sc.nextLine();

        Usuario nuevoUsuario = new Usuario(nombre, edad, correoElectronico, salarioMensual);
        System.out.println("Usuario registrado exitosamente.");
    }
}