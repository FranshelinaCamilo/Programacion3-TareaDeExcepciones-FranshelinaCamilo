public class UsuarioService {

    public static void validarUsuario(String nombre, int edad, String correoElectronico, double salarioMensual) throws NombreInvalidoException, EdadInvalidaException, CorreoInvalidoException, SalarioInvalidoException {
        validarNombre(nombre);
        validarEdad(edad);
        validarCorreoElectronico(correoElectronico);
        validarSalario(salarioMensual);
    }

    public static void validarNombre(String nombre) throws NombreInvalidoException {
        if (nombre.trim().isEmpty()) {
            throw new NombreInvalidoException("\nError: El nombre no puede estar vacío.");
        }
        if (nombre.length() < 3) {
            throw new NombreInvalidoException("\nError: El nombre debe contener al menos 3 caracteres.");
        }
    }

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 18) {
            throw new EdadInvalidaException("\nError: La edad debe ser mayor o igual a 18 años.");
        }
        if (edad > 100) {
            throw new EdadInvalidaException("\nError: La edad debe ser menor o igual a 100 años.");
        }
    }

    public static void validarCorreoElectronico(String correo) throws CorreoInvalidoException {
        if (!correo.contains("@") || !correo.contains(".") ) {
            throw new CorreoInvalidoException("\nError: El correo electrónico no es válido.");
        }
    }

    public static void validarSalario(double salario) throws SalarioInvalidoException {
        if (salario <= 0) {
            throw new SalarioInvalidoException("\nError: El salario debe ser mayor que cero.");
        }
    }
}
