import java.util.Scanner;

public class BucleIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce tu edad:");
        int edad = Integer.parseInt(scanner.nextLine());

        // Ejemplo con "if" simple
        if (edad < 18) {
            System.out.println("Eres menor de edad.");
        }

        // Ejemplo con "if-else"
        if (edad < 18) {
            // true hasta 17.99999...
            System.out.println("Eres menor de edad.");
        } else {
            // 18 o > 18
            System.out.println("Eres mayor de edad.");
        }

        // Ejemplo con "if-else if-else"
        if (edad < 18) {
            // Hasta 17.9999...
            System.out.println("Eres menor de edad.");
        } else if (edad == 18) {
            // 18
            System.out.println("¡Ya puedes votar!");
        } else {
            // > 18
            System.out.println("Eres mayor de edad");
        }

        scanner.close();
    }
}

