import java.util.*;

public class SistemaUsuario {
    private List<Usuario> usuarios;

    public SistemaUsuario() {
        this.usuarios = new ArrayList<>();
    }

    public void registrarUsuario(Scanner sc) {
        try{
            System.out.print("\n|> Ingrese el nombre del usuario: ");
            String nombre = sc.nextLine();

            System.out.print("|> Ingrese la edad del usuario: ");
            int edad = sc.nextInt();
            sc.nextLine(); 

            System.out.print("|> Ingrese el correo electrónico del usuario: ");
            String correoElectronico = sc.nextLine();

            System.out.print("|> Ingrese el salario mensual del usuario: ");
            double salarioMensual = sc.nextDouble();
            sc.nextLine();


            UsuarioService.validarUsuario(nombre, edad, correoElectronico, salarioMensual);

            Usuario nuevoUsuario = new Usuario(nombre, edad, correoElectronico, salarioMensual);

            usuarios.add(nuevoUsuario);
            System.out.println("\nUsuario registrado correctamente.");
        } 
        catch (NombreInvalidoException e) {
            System.out.println(e.getMessage());
        }
        catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        }
        catch (CorreoInvalidoException e) {
            System.out.println(e.getMessage());
        }
        catch (SalarioInvalidoException e) {
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("\nError: Debe ingresar un numero valido."); 
            sc.nextLine();
        }
        finally {
            System.out.println("Proceso finalizado.");
        }
    }
}