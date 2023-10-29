import java.util.Scanner;

public class OperacionesMatematicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Introduce el segundo número:");
        double num2 = Double.parseDouble(scanner.nextLine());

        // Encuentra el valor máximo entre num1 y num2
        double maximo = Math.max(num1, num2);
        System.out.println("El valor máximo entre " + num1 + " y " + num2 + " es: " + maximo);

        // Encuentra el valor mínimo entre num1 y num2
        double minimo = Math.min(num1, num2);
        System.out.println("El valor mínimo entre " + num1 + " y " + num2 + " es: " + minimo);

        // Calcula la raíz cuadrada de num1
        double raizCuadrada = Math.sqrt(num1);
        System.out.println("La raíz cuadrada de " + num1 + " es: " + raizCuadrada);

        // Calcula el valor absoluto de num2
        double valorAbsoluto = Math.abs(num2);
        System.out.println("El valor absoluto de " + num2 + " es: " + valorAbsoluto);

        // Genera un número aleatorio entre 0 y 100 (inclusive)
        int numeroAleatorio = (int) (Math.random() * 100);
        System.out.println("Número aleatorio entre 0 y 1000: " + numeroAleatorio);

        System.out.println("Redondeos:");
        // Redondeo con Math.round()
        double numeroRedondeado = Math.round(num1);
        System.out.println("Redondeo con Math.round(): " + numeroRedondeado);

        // Redondeo hacia abajo con Math.floor()
        double numeroRedondeoAbajo = Math.floor(num1);
        System.out.println("Redondeo hacia abajo con Math.floor(): " + numeroRedondeoAbajo);

        // Redondeo hacia arriba con Math.ceil()
        double numeroRedondeoArriba = Math.ceil(num1);
        System.out.println("Redondeo hacia arriba con Math.ceil(): " + numeroRedondeoArriba);

        scanner.close();
    }
}
