import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduce un número:");
    String a = scanner.nextLine();
    System.out.println("Introduce otro número:");
    String b = scanner.nextLine();
    int num1 = Integer.valueOf(a);
    int num2 = Integer.valueOf(b);
    System.out.print("Resultado:");
    System.out.println(num1 + num2);
    scanner.close();
  }
}


