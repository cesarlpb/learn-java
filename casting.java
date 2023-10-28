public class casting {
    public static void main(String[] args) {
        System.out.println("Casting de byte a double:");
        byte byte_ = 127;
        int int_ = byte_;
        double double_ = byte_;
        System.out.println("El byte " + byte_ + " es el double " + double_ + " y es el int " + int_);

        System.out.println("Casting de double a byte:");
        double double2 = 0.99999;
        int int2 = (int) Math.round(double2); // Aplicamos redondeo
        // Más info: https://www.tutorialspoint.com/java/number_round.htm
        System.out.println("El double " + double2 + " es int " + int2);

    }
}
