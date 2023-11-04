import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class leerTxt {
    public static void main(String[] args) throws IOException {
        // Especifica la ruta de tu archivo de texto
        String nombreArchivo = "archivo.txt";

        // Crea un FileReader para leer el archivo
        FileReader archivoReader = new FileReader(nombreArchivo);

        // Crea un BufferedReader para leer líneas
        BufferedReader bufferedReader = new BufferedReader(archivoReader);

        // Lee la primera línea del archivo
        String primeraLinea = bufferedReader.readLine();

        // Muestra la primera línea en la consola
        System.out.println(nombreArchivo);
        System.out.println("-------------");
        System.out.println(primeraLinea);

        // Cierra el archivo después de la lectura
        bufferedReader.close();
    }
}
