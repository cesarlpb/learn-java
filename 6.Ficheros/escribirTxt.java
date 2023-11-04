import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class escribirTxt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una línea de texto para guardar en el log:");
        String linea = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter("log.txt", true); // Abre el archivo en modo de anexar
            writer.write(linea + "\n"); // Escribe la línea en el archivo
            writer.close(); // Cierra el archivo

            System.out.println("Línea guardada en el 'log.txt' correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar en el log: Revisa el nombre del archivo." + e.getMessage() );
        }
        scanner.close();
    }
}
