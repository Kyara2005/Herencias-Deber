public class Cliente extends Persona {
    public Cliente(String nombre, String cedula, String direccion, String telefono) {
        super(nombre, cedula, direccion, telefono);
    }

    public boolean ingresarAlSistema() {
        return true;
    }

    public void registrarCuenta(String tipo) {
        System.out.println("Cuenta tipo '" + tipo + "' registrada.");
    }

    public void solicitarPrestamo(double monto) {
        System.out.println("Préstamo de $" + monto + " solicitado.");
    }

    public void agregarTarjetaCredito(String tarjeta) {
        System.out.println("Tarjeta '" + tarjeta + "' agregada.");
    }

    public void verResumenFinanciero() {
        System.out.println("Resumen financiero de " + nombre);
    }

    @Override
    public void mostrarRol() {
        System.out.println("Soy un Cliente");
    }
}


