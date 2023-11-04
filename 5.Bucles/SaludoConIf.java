import java.util.Scanner;

public class SaludoConIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la hora (0 - 23):");
        int hora = Integer.parseInt(scanner.nextLine());

        if(hora <= 14 && hora > 0){
            System.out.println("¡Buenos días!");
        } else if (hora > 14 && hora <= 20) {
            System.out.println("¡Buenos tardes!");
        } else if (hora > 20 && hora < 24) {
            System.out.println("¡Buenas noches!");
        } else {
            System.out.println("Eso no es una hora correcta");
        }
        scanner.close();
    }
}

    