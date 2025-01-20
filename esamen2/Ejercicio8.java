package esamen2;

//Ejercicio 8: Ordenar las filas de una matriz por la suma de sus elementos.
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio8 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Introduce el número de filas: ");
     int filas = sc.nextInt();
     System.out.print("Introduce el número de columnas: ");
     int columnas = sc.nextInt();

     int[][] matriz = new int[filas][columnas];
     System.out.println("Introduce los valores de la matriz:");
     for (int i = 0; i < filas; i++) {
         for (int j = 0; j < columnas; j++) {
             System.out.printf("Elemento [%d][%d]: ", i, j);
             matriz[i][j] = sc.nextInt();
         }
     }

     int[][] matrizOrdenada = ordenarFilasPorSuma(matriz);
     System.out.println("Matriz ordenada por suma de filas:");
     for (int[] fila : matrizOrdenada) {
         System.out.println(Arrays.toString(fila));
     }
 }

 public static int[][] ordenarFilasPorSuma(int[][] matriz) {
     return Arrays.stream(matriz)
                  .sorted((a, b) -> Integer.compare(Arrays.stream(a).sum(), Arrays.stream(b).sum()))
                  .toArray(int[][]::new);
 }
}

