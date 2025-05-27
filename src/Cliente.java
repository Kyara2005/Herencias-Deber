public class Cliente extends Persona {
    private String numeroCuenta;
    private double saldo;

    public Cliente(String nombre, String cedula, String direccion, String telefono, String numeroCuenta, double saldo) {
        super(nombre, cedula, direccion, telefono);
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    @Override
    public void mostrarRol() {
        System.out.println("Soy un cliente del banco.");
    }
}

