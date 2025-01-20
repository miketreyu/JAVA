package esamen2;

//Ejercicio 6: Buscar el valor máximo en una matriz y mostrar su posición.
import java.util.Scanner;
public class Ejercicio6 {
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

     int[] resultado = buscarMaximo(matriz);
     System.out.printf("El valor máximo es %d en la posición [%d][%d].\n", resultado[0], resultado[1], resultado[2]);
 }

 public static int[] buscarMaximo(int[][] matriz) {
     int max = matriz[0][0];
     int fila = 0, columna = 0;

     for (int i = 0; i < matriz.length; i++) {
         for (int j = 0; j < matriz[i].length; j++) {
             if (matriz[i][j] > max) {
                 max = matriz[i][j];
                 fila = i;
                 columna = j;
             }
         }
     }
     return new int[] { max, fila, columna };
 }
}