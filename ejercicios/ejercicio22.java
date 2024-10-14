package ejercicios;
import java.util.*;

public class ejercicio22 {
    public static void main(String[] args) {
        // PEDIR UN NUMERO
        // SABER SI ES PRIMO O NO
        // FINALIZARA SI EL NUMERO QUE INGRESE ES -1
        Scanner sc = new Scanner(System.in);
        int numero;
        
        do {
            System.out.println("Introduzca un número (o -1 para salir): ");
            numero = sc.nextInt();
            
            if (numero == -1) break;
            
            if (esPrimo(numero)) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }
            
        } while (numero != -1);

        System.out.println("Se cierra el programa.");
        sc.close();
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}
