package esamen2;

//Ejercicio 9: Contar elementos positivos, negativos y ceros en una matriz.
import java.util.Scanner;
public class Ejercicio9 {
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

     int[] conteo = contarElementos(matriz);
     System.out.printf("Positivos: %d, Negativos: %d, Ceros: %d\n", conteo[0], conteo[1], conteo[2]);
 }

 public static int[] contarElementos(int[][] matriz) {
     int positivos = 0, negativos = 0, ceros = 0;

     for (int[] fila : matriz) {
         for (int elem : fila) {
             if (elem > 0) positivos++;
             else if (elem < 0) negativos++;
             else ceros++;
         }
     }
     return new int[] { positivos, negativos, ceros };
 }
}
