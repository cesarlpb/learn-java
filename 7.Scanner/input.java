import java.util.Scanner;

public class input {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduce un texto:");

    String userName = scanner.nextLine();
    System.out.println("El texto es: " + userName);

    scanner.close();
  }  
}

