package ejercicios2;

import java.util.Arrays;

public class ejercicio20 {

    public static void main(String[] args) {
        // Definir la matriz 5x5
        int [][] matriz = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };
        
        // Variable para almacenar la suma de la diagonal principal
        int sumaDiagonal = 0;
        
        // Calcular la suma de los elementos en la diagonal principal
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonal += matriz[i][i];  // Suma los elementos de la diagonal principal
        }
        
        // Mostrar la matriz de forma legible (fila por fila)
        System.out.println("Matriz original:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));  // Imprime cada fila de la matriz
        }
        
        // Mostrar la suma de la diagonal principal
        System.out.println("\nSuma de la diagonal principal: " + sumaDiagonal);
    }
}
