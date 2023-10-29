import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        
        // Creamos objeto scanner para leer desde consola:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número:");
        String str = scanner.nextLine();
        System.out.println("Introduce otro número:");
        String str2 = scanner.nextLine();

        int x = Integer.valueOf(str);
        int y = Integer.valueOf(str2);
        
        scanner.close();

        // Suma (Adición)
        int suma = x + y;
        System.out.println("Suma: " + suma);

        // Resta (Sustracción)
        int resta = x - y;
        System.out.println("Resta: " + resta);

        // Multiplicación
        int multiplicacion = x * y;
        System.out.println("Multiplicación: " + multiplicacion);

        // División
        int division = x / y;
        System.out.println("División entera: " + division);

        // Módulo (Resto)
        int modulo = x % y;
        System.out.println("Módulo (Resto): " + modulo);

        // Incremento
        int incremento = ++x; // Incrementa x en 1 antes de asignar
        System.out.println("Incremento de x:" + incremento);

        // Decremento
        int decremento = --x; // Decrementa x en 1 antes de asignar
        System.out.println("Decremento de x: " + decremento);
    }
}
