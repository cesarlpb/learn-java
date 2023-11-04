import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número:");
        String str = scanner.nextLine();
        int x = Integer.valueOf(str);

        // Operador Lógico AND (&&)
        System.out.println("¿Es menor que 5 Y mayor que 0?");
        boolean condicionAND = (x < 5) && (x > 0);
        System.out.println("x < 5 && x > 0: " + condicionAND); // Imprime el resultado de la expresión lógica

        // Operador Lógico OR (||)
        System.out.println("¿Es menor que 5 o mayor que 0?");
        boolean condicionOR = (x < 5) || (x > 0);
        System.out.println("x < 5 || x > 0: " + condicionOR); // Imprime el resultado de la expresión lógica

        // Operador Lógico NOT (!)
        System.out.println("NO (es menor que 5 Y mayor que 0)");
        boolean condicionNOT = !(x < 5 && x > 0);
        System.out.println("!(x < 5 && x > 0): " + condicionNOT); // Imprime el resultado de la expresión lógica

        scanner.close();
    }
}
