public class numeros2 {
        public static void main(String[] args) {
            byte byte_ = 127; 
            System.out.println("Máx byte: " + byte_);
            short short_ = 32767;
            System.out.println("Máx short: " + short_);
            int int_ = 2147483647;
            System.out.println("Máx int: " + int_);
            long long_ = 9223372036854775807L;
            System.out.println("Máx long: " + long_);
            float float_ = 19.999999f;
            System.out.println("Máx float: " + float_);
            double double_ = 0.9999999999999999;
            System.out.println("Máx double: " + double_);
            // Ejercicio: Hacer lo mismo con negativos.
            // Notación científica
            System.out.println("Notación Científica");
            
            System.out.println("Número grande:");
            int millon = 1000000;
            float millon_ = 1e6f; // e6 -> 6 ceros a la derecha
            System.out.println(millon);
            System.out.println(millon_);
            
            System.out.println("Número pequeño:");
            float milesima = 0.001f;
            float milesima_ = 1e-3f; // e-3 -> 3 ceros a la izquierda
            System.out.println(milesima);
            System.out.println(milesima_);
        }    
}
