public class strings {
    public static void main(String[] args) {
        String string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse libero risus, porttitor sed dignissim et, lobortis vitae neque. Mauris pharetra leo vitae blandit imperdiet. Duis elit orci, imperdiet eget malesuada vel, viverra quis arcu. Duis condimentum leo dapibus ante consequat, vel lacinia odio aliquam. Cras accumsan, augue vitae fermentum convallis, libero augue laoreet quam, ac elementum turpis ante eu orci. Mauris in porta diam. Sed nec ultrices leo, sed malesuada nulla. Suspendisse potenti. Sed vulputate dictum augue vitae posuere. Suspendisse potenti. Etiam sed magna odio.";
        System.out.println("El texto tiene: " + string.length() + " caracteres Unicode");
        
        String minusculas = "abc";
        String mayusculas = "HOLA, ¿QUÉ TAL?";
        System.out.println(minusculas.toUpperCase()); // ABC
        System.out.println(mayusculas.toLowerCase()); // hola, ¿qué tal?

        String saludo = "Bienvenido, Sr. Anderson";
        System.out.println("Sr. aparece en la posición: " + saludo.indexOf("B")); // Empieza a contar en CERO <- ojo

        System.out.println("Concatenación:");
        String texto1 = "Hola,";
        String texto2 = "bienvenid@";
        // Concatenamos con +
        System.out.println(texto1 + texto2); // Sin espacio
        System.out.println(texto1 + " " + texto2); // Con espacios

        // Usamos concat()
        System.out.println(texto1.concat(texto2)); // Sin espacios
        System.out.println(texto1.concat(" ").concat(texto2)); // Con espacios

        // Fuente: https://www.delftstack.com/es/howto/java/java-string-interpolation

        // Usamos format()
        String nombre = "César";
        String saludo2 = "Buenos";
        String mensaje = String.format("%s días, %s. ¡Es un día excelente!", saludo2, nombre);
        System.out.println(mensaje);

        // Usamos formatted:
        String miSaludo = "Buenas";
        String datos[] = {
            miSaludo, 
            "César", 
            "excelente"
        };
        String mensaje2 = "%s, %s. Hoy es un %s día.".formatted(datos);
        System.out.println(mensaje2);

        // Operador + con números y texto
        System.out.println("Suma: " + 2 + 3); // Suma: 23
        System.out.println("Suma: " + (2 + 3)); // Suma: 5
        // Recomendación:
        int resultado = 2 + 3;
        System.out.println("Resultado: " + resultado);

        // Caracteres especiales:
        String miTexto = "Esto es un \"\"texto\"\" sobre el texto con \nsalto \n\nde \tlínea y tabulador";
        System.out.println(miTexto);

        // Ejemplo con \t
        System.out.println("Ejemplo con \\t:");
        int suma = 2 + 3;
        int resta = 3 - 2;
        System.out.println("Suma:\t\t" + suma);
        System.out.println("Diferencia:\t" + resta);
    }
}
