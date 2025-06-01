import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = null;
        Cajero cajero = new Cajero("Luis", "010203", "Quito", "0999999999", "cajero1", "1234");

        while (true) {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Ingresar como Cliente");
            System.out.println("3. Ingresar como Cajero");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            int op = sc.nextInt(); sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Nombre: "); String n = sc.nextLine();
                    System.out.print("Cédula: "); String c = sc.nextLine();
                    System.out.print("Dirección: "); String d = sc.nextLine();
                    System.out.print("Teléfono: "); String t = sc.nextLine();
                    cliente = new Cliente(n, c, d, t);
                    System.out.println("Cliente registrado.");
                    break;

                case 2:
                    if (cliente == null) {
                        System.out.println("No hay cliente registrado.");
                        break;
                    }
                    cliente.mostrarRol();
                    cliente.verResumenFinanciero();
                    break;

                case 3:
                    System.out.print("Usuario: "); String u = sc.nextLine();
                    System.out.print("Clave: "); String p = sc.nextLine();
                    if (cajero.autenticarEmpleado(u, p)) {
                        System.out.println("Bienvenido, Cajero.");
                        if (cliente != null) {
                            cajero.procesarDeposito(cliente, 100);
                        }
                    } else {
                        System.out.println("Credenciales incorrectas.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
