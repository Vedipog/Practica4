import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        mostrarFechaYHora();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n¿Cuántos usuarios quieres registrar?: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada

        // Recogemos el array generado por el método
        Usuario[] misUsuarios = registrarUsuarios(cantidad, scanner);

        // Mostramos el contenido
        System.out.println("\n--- LISTA DE USUARIOS REGISTRADOS ---");
        for (Usuario u : misUsuarios) {
            System.out.println("Nombre: " + u.nombre + " | Apellidos: " + u.apellidos + " | Email: " + u.email);
        }

        scanner.close();
    }

    public static void mostrarFechaYHora() {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Fecha y hora actual: " + ahora.format(formatter));
    }

    public static Usuario[] registrarUsuarios(int cantidad, Scanner scanner) {
        Usuario[] usuarios = new Usuario[cantidad];

        for (int i = 0; i < cantidad; i++) {
            usuarios[i] = new Usuario(); // Instanciar cada usuario
            System.out.println("\nDatos del usuario " + (i + 1) + ":");
            System.out.print("Nombre: ");
            usuarios[i].nombre = scanner.nextLine();
            System.out.print("Apellidos: ");
            usuarios[i].apellidos = scanner.nextLine();
            System.out.print("Email: ");
            usuarios[i].email = scanner.nextLine();
        }
        return usuarios;
    }
}