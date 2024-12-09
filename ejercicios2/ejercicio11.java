package ejercicios2;

import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        // Crear objeto Scanner para leer la entrada
        Scanner sc = new Scanner(System.in);
        
        // Definir dimensiones de las matrices (por ejemplo, 3x3)
        int filas = 3; // Número de filas
        int columnas = 3; // Número de columnas
        
        // Inicializar las matrices A, B y C con las dimensiones adecuadas
        int[][] A = new int[filas][columnas];
        int[][] B = new int[filas][columnas];
        int[][] C = new int[filas][columnas];
        
        // Leer valores para la matriz A
        System.out.println("Introduce los elementos de la matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print("Elemento A[" + i + "][" + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }
        
        // Leer valores para la matriz B
        System.out.println("Introduce los elementos de la matriz B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print("Elemento B[" + i + "][" + j + "]: ");
                B[i][j] = sc.nextInt();
            }
        }
        
        // Operación de suma entre matrices A y B para obtener C
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        
        // Imprimir la matriz C (resultado de la suma)
        System.out.println("La matriz C (A + B) es:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        
        // Cerrar el scanner
        sc.close();
    }
}
