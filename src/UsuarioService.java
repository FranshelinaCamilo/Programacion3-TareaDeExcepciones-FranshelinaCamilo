public class UsuarioService {

    public static void validarUsuario(String nombre, int edad, String correoElectronico, double salarioMensual) throws NombreValidatorException, EdadValidatorException, CorreoValidatorException, SalarioValidatorException {
        validarNombre(nombre);
        validarEdad(edad);
        validarCorreoElectronico(correoElectronico);
        validarSalario(salarioMensual);
    }

    public static void validarNombre(String nombre) throws NombreValidatorException {
        if (nombre.trim().isEmpty()) {
            throw new NombreValidatorException("\nError: El nombre no puede estar vacío.");
        }
        if (nombre.length() < 3) {
            throw new NombreValidatorException("\nError: El nombre debe contener al menos 3 caracteres.");
        }
    }

    public static void validarEdad(int edad) throws EdadValidatorException {
        if (edad < 18) {
            throw new EdadValidatorException("\nError: La edad debe ser mayor o igual a 18 años.");
        }
        if (edad > 100) {
            throw new EdadValidatorException("\nError: La edad debe ser menor o igual a 100 años.");
        }
    }

    public static void validarCorreoElectronico(String correo) throws CorreoValidatorException {
        if (!correo.contains("@") || !correo.contains(".") ) {
            throw new CorreoValidatorException("\nError: El correo electrónico no es válido.");
        }
    }

    public static void validarSalario(double salario) throws SalarioValidatorException {
        if (salario <= 0) {
            throw new SalarioValidatorException("\nError: El salario debe ser mayor que cero.");
        }
    }
}
