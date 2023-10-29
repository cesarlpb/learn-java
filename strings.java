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
    }
}
