public class UsuarioService {

    public static void validarUsuario(Usuario usuario) throws NombreValidatorException, EdadValidatorException, CorreoValidatorException, SalarioValidatorException {
        validarNombre(usuario.getNombre());
        validarEdad(usuario.getEdad());
        validarCorreoElectronico(usuario.getCorreoElectronico());
        validarSalario(usuario.getSalarioMensual());
    }

    public static void validarNombre(String nombre) throws NombreValidatorException {
        if (nombre.trim().isEmpty()) {
            throw new NombreValidatorException("Error: El nombre no puede estar vacío.");
        }
        if (nombre.length() < 3) {
            throw new NombreValidatorException("Error: El nombre debe contener al menos 3 caracteres.");
        }
    }

    public static void validarEdad(int edad) throws EdadValidatorException {
        if (edad < 18 || edad > 100) {
            throw new EdadValidatorException("Error: La edad debe ser mayor o igual a 18 años.");
        }
    }

    public static void validarCorreoElectronico(String correo) throws CorreoValidatorException {
        if (!correo.contains("@") || !correo.contains(".") ) {
            throw new CorreoValidatorException("Error: El correo electrónico no es válido.");
        }
    }

    public static void validarSalario(double salario) throws SalarioValidatorException {
        if (salario < 0) {
            throw new SalarioValidatorException("Error: El salario debe ser mayor que 0.");
        }
    }
}
