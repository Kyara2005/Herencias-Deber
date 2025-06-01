public class Cajero extends Empleado {
    public Cajero(String nombre, String cedula, String direccion, String telefono, String usuario, String clave) {
        super(nombre, cedula, direccion, telefono, usuario, clave);
    }

    public void procesarRetiro(Cliente c, double monto) {
        System.out.println("Retiro de $" + monto + " procesado para " + c.nombre);
    }

    public void procesarDeposito(Cliente c, double monto) {
        System.out.println("Depósito de $" + monto + " procesado para " + c.nombre);
    }

    public void consultarSaldo(Cliente c) {
        System.out.println("Consultando saldo de " + c.nombre);
    }

    @Override
    public void mostrarRol() {
        System.out.println("Soy un Cajero");
    }
}
