package esamen2;

// Ejercicio 5: Determinar el número más frecuente en un array.
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el tamaño del array: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Introduce los elementos del array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + i + ": ");
            array[i] = sc.nextInt();
        }

        int masFrecuente = encontrarMasFrecuente(array);
        System.out.println("El número más frecuente es: " + masFrecuente);
    }

    public static int encontrarMasFrecuente(int[] array) {
        Map<Integer, Integer> frecuencia = new HashMap<>();

        for (int num : array) {
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
        }

        int maxFrecuencia = 0;
        int masFrecuente = array[0];

        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                maxFrecuencia = entry.getValue();
                masFrecuente = entry.getKey();
            }
        }

        return masFrecuente;
    }
}
