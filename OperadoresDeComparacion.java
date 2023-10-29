import java.util.Scanner;

public class OperadoresDeComparacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número:");
        String str = scanner.nextLine();
        System.out.println("Introduce otro número:");
        String str2 = scanner.nextLine();

        int x = Integer.valueOf(str);
        int y = Integer.valueOf(str2);

        // Operador de Igualdad
        boolean igualdad = x == y;
        System.out.println("x == y: " + igualdad); // Imprime "x == y: false"

        // Operador de Desigualdad
        boolean desigualdad = x != y;
        System.out.println("x != y: " + desigualdad); // Imprime "x != y: true"

        // Operador Mayor que
        boolean mayorQue = x > y;
        System.out.println("x > y: " + mayorQue); // Imprime "x > y: false"

        // Operador Menor que
        boolean menorQue = x < y;
        System.out.println("x < y: " + menorQue); // Imprime "x < y: true"

        // Operador Mayor o Igual que
        boolean mayorOIgualQue = x >= y;
        System.out.println("x >= y: " + mayorOIgualQue); // Imprime "x >= y: false"

        // Operador Menor o Igual que
        boolean menorOIgualQue = x <= y;
        System.out.println("x <= y: " + menorOIgualQue); // Imprime "x <= y: true"

        scanner.close();
    }
}
