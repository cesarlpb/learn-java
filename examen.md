**Examen de Java - Nivel Básico**

1. ¿Cuál de las siguientes no es una palabra clave en Java?
   a) int
   b) string
   c) class
   d) for

2. ¿Cuál es la salida del siguiente código?
   ```java
   int x = 5;
   int y = 3;
   System.out.println(x + y);
   ```
   a) 8
   b) 53
   c) 35
   d) 15

3. ¿Qué bucle se utiliza comúnmente para recorrer un array en Java?
   a) while
   b) for
   c) if
   d) do-while

4. ¿Cuál es el operador utilizado para la igualdad en Java?
   a) ==
   b) =
   c) !=
   d) ===

5. ¿Qué declaración se utiliza para tomar la entrada del usuario en Java?
   a) read
   b) input
   c) Scanner
   d) console

6. ¿Cuál es el resultado de 7 % 3?
   a) 4
   b) 2
   c) 0
   d) 1

7. ¿Cuál de las siguientes es una forma válida de declarar una cadena en Java?
   a) "Hola, Mundo"
   b) 'Hola, Mundo'
   c) [Hola, Mundo]
   d) (Hola, Mundo)

8. ¿Cuál es el valor de x después de ejecutar el siguiente código?
   ```java
   int x = 10;
   x++;
   ```
   a) 10
   b) 11
   c) 9
   d) 12

9. ¿Cuál es el nombre del método que se ejecuta automáticamente cuando se crea un objeto en Java?
   a) constructor
   b) start
   c) main
   d) initialize

10. ¿Cuál es el operador utilizado para incrementar una variable en Java?
    a) ++
    b) +
    c) +=
    d) =+

11. ¿Qué bucle se ejecuta al menos una vez en Java?
    a) while
    b) for
    c) do-while
    d) if

12. ¿Qué palabra clave se usa para declarar una constante en Java?
    a) var
    b) final
    c) const
    d) let

13. ¿Cuál de las siguientes declaraciones es correcta para leer un entero de la entrada estándar en Java?
    a) Scanner.next()
    b) Scanner.nextInt()
    c) System.in.read()
    d) InputStreamReader.readInt()

14. ¿Cuál es el resultado de 5 > 3 && 4 < 7?
    a) true
    b) false
    c) 8
    d) error

15. ¿Qué método se utiliza para imprimir un valor en Java?
    a) print()
    b) output()
    c) log()
    d) display()

16. ¿Qué tipo de estructura condicional se usa cuando se desea seleccionar entre múltiples opciones?
    a) if-else
    b) switch
    c) while
    d) for

17. ¿Cuál es el operador de igualdad en Java que también compara el tipo de dato?
    a) ==
    b) !=
    c) ===
    d) !=

18. ¿Cuál es el operador que se utiliza para concatenar cadenas en Java?
    a) +
    b) &
    c) ||
    d) ,

19. ¿Cuál es el tipo de datos utilizado para representar valores verdaderos o falsos en Java?
    a) int
    b) double
    c) boolean
    d) char

20. ¿Qué método se utiliza para escribir en un archivo de texto en Java?
    a) System.out.println()
    b) FileWriter.write()
    c) Console.readLine()
    d) Scanner.nextInt()

---

**Ejercicio - Guardar Datos en un Archivo de Texto**

Crea un programa Java que solicite al usuario ingresar una línea de texto y luego guarde esa línea en un archivo de texto como registro de un log. A continuación, se muestra un ejemplo de cómo hacerlo:

```java
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GuardarEnLog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una línea de texto para guardar en el log:");
        String linea = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter("log.txt", true); // Abre el archivo en modo de anexar
            writer.write(linea + "\n"); // Escribe la línea en el archivo
            writer.close(); // Cierra el archivo

            System.out.println("Línea

 guardada en el log correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar en el log: " + e.getMessage());
        }
    }
}
```
