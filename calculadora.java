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
    System.out.println("Resultados:");
    System.out.println("Suma: " + (num1 + num2));
    System.out.println("Resta: " + (num1 - num2));
    System.out.println("Producto: " + (num1 * num2));
    // Añadimos if else para evitar error de división por cero
    if(num2 == 0){
      System.out.println("No se puede dividir por cero");
    } else {
      System.out.println("División: " + (num1 / num2));
    }
    scanner.close();
  }
}


