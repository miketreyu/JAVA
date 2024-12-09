package ejercicios2;
import java.util.*;

public class ejercicio21 {
    /*
    Escribe un programa que pida un valor entero en millas y muestre su equivalente en kilómetros.
    Recuerda que una milla son 1,60934 kilómetros. Implementa y utiliza la función:
    double millas_a_kilometros(int millas) // Devuelve la conversión de millas a kilómetros
    */

    // Función que convierte millas a kilómetros
    public static double millas_a_kilometros(int millas) {
        return millas * 1.60934;
    }
    
    public static void main(String[] args) {
        // Crear objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        
        // Pedir al usuario que ingrese el valor en millas
        System.out.print("Introduce el valor en millas: ");
        int millas = sc.nextInt();
        
        // Convertir las millas a kilómetros usando la función
        double kilometros = millas_a_kilometros(millas);
        
        // Mostrar el resultado
        System.out.println(millas + " millas son " + kilometros + " kilómetros.");
        
        // Cerrar el scanner
        sc.close();
    }
}
