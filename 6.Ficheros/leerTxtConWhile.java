import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class leerTxtConWhile {
    public static void main(String[] args) throws IOException {
        // Especifica la ruta de tu archivo de texto
        String nombreArchivo = "archivo.txt";

        // Crea un FileReader para leer el archivo
        FileReader archivoReader = new FileReader(nombreArchivo);

        // Crea un BufferedReader para leer líneas
        BufferedReader bufferedReader = new BufferedReader(archivoReader);

        System.out.println(nombreArchivo);
        System.out.println("-------------");

        String linea;
        // Lee el archivo línea por línea
        while ((linea = bufferedReader.readLine()) != null) {
            System.out.println(linea);
        }

        // Cierra el archivo después de la lectura
        bufferedReader.close();
    }
}
