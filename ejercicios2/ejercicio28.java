package ejercicios2;
import java.util.*;

public class ejercicio28 {
	/*
	4. Escribe una función que muestre por pantalla un triángulo como el del ejemplo. Deberá recibir
	dos parámetros: el carácter que se desea imprimir y el número de líneas del triángulo.  
	*/

    // Función para imprimir la pirámide
    public static void imprimirPiramide(char caracter, int numLineas) {
        // Iterar sobre el número de líneas (altura de la pirámide)
        for (int i = 1; i <= numLineas; i++) {
            // Imprimir los espacios a la izquierda para centrar
            for (int j = 0; j < numLineas - i; j++) {
                System.out.print(" ");
            }
            // Imprimir los caracteres (forma de la pirámide)
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print(caracter);
            }
            // Salto de línea al final de cada fila
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Crear el objeto Scanner para leer entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el carácter y el número de líneas
        System.out.print("Introduce el carácter que deseas usar: ");
        char caracter = scanner.next().charAt(0);

        System.out.print("Introduce el número de líneas de la pirámide: ");
        int numLineas = scanner.nextInt();

        // Llamar a la función para imprimir la pirámide
        imprimirPiramide(caracter, numLineas);

        // Cerrar el scanner
        scanner.close();
    }
}

