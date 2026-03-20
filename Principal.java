import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        mostrarFechaYHora();
    }

    public static void mostrarFechaYHora() {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Fecha y hora actual: " + ahora.format(formatter));
    }
}