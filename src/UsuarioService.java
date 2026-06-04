public class UsuarioService {
    public static void validarNombre(String nombre) throws NombreValidatorException {
        if (nombre.trim().isEmpty()) {
            throw new NombreValidatorException("El nombre no puede estar vacío.");
        }
        if (nombre.length() < 3) {
            throw new NombreValidatorException("El nombre debe tener al menos 3 caracteres.");
        }
    }

    public static void validarEdad(int edad) throws EdadValidatorException {
        if (edad < 18 || edad > 100) {
            throw new EdadValidatorException("La edad debe ser mayor o igual a 18 años y menor o igual a 100 años.");
        }
    }

    public static void validarCorreoElectronico(String correo) throws CorreoValidatorException {
        if (!correo.contains("@") || !correo.contains(".") ) {
            throw new CorreoValidatorException("El correo electrónico no es válido.");
        }
    }

    public static void validarSalario(double salario) throws SalarioValidatorException {
        if (salario < 0) {
            throw new SalarioValidatorException("El salario no puede ser negativo.");
        }
    }
}
