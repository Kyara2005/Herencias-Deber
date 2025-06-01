public abstract class Empleado extends Persona {
    protected String usuario;
    protected String clave;

    public Empleado(String nombre, String cedula, String direccion, String telefono, String usuario, String clave) {
        super(nombre, cedula, direccion, telefono);
        this.usuario = usuario;
        this.clave = clave;
    }

    public boolean autenticarEmpleado(String u, String c) {
        return usuario.equals(u) && clave.equals(c);
    }

    public abstract void mostrarRol();
}
