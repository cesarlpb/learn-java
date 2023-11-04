import java.util.Scanner;

public class OperadoresDeAsignacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número:");
        String str = scanner.nextLine();

        int x = Integer.valueOf(str);
        System.out.println("Valor recibido: " + x);
        // Operador de Asignación Simple
        x = 5;
        System.out.println("x = " + x); // Imprime "x = 5"

        System.out.println("Aritméticos:");
        // Operador de Asignación con Adición
        x += 3; // Equivale a x = x + 3;
        System.out.println("x += 3: " + x); // Imprime "x += 3: 8"

        // Operador de Asignación con Sustracción
        x -= 3; // Equivale a x = x - 3;
        System.out.println("x -= 3: " + x); // Imprime "x -= 3: 5"

        // Operador de Asignación con Multiplicación
        x *= 3; // Equivale a x = x * 3;
        System.out.println("x *= 3: " + x); // Imprime "x *= 3: 15"

        // Operador de Asignación con División
        x /= 3; // Equivale a x = x / 3;
        System.out.println("x /= 3: " + x); // Imprime "x /= 3: 5"

        // Operador de Asignación con Módulo
        x %= 3; // Equivale a x = x % 3;
        System.out.println("x %= 3: " + x); // Imprime "x %= 3: 2"

        System.out.println("Bitwise y lógicos:");

        // Operador de Asignación con AND Bitwise
        x &= 3;
        System.out.println("x &= 3: " + x); // Imprime "x &= 3: 2"

        // Operador de Asignación con OR Bitwise
        x |= 3;
        System.out.println("x |= 3: " + x); // Imprime "x |= 3: 3"

        // Operador de Asignación con XOR Bitwise
        x ^= 3;
        System.out.println("x ^= 3: " + x); // Imprime "x ^= 3: 0"

        // Operador de Asignación con Desplazamiento a la Derecha
        x >>= 3;
        System.out.println("x >>= 3: " + x); // Imprime "x >>= 3: 0"

        // Operador de Asignación con Desplazamiento a la Izquierda
        x <<= 3;
        System.out.println("x <<= 3: " + x); // Imprime "x <<= 3: 0"

        scanner.close();
    }
}
