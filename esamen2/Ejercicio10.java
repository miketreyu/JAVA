package esamen2;

//Ejercicio 10: Calcular el determinante de una matriz 2x2.
import java.util.Scanner;
public class Ejercicio10 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Introduce los elementos de la matriz 2x2:");
     int[][] matriz = new int[2][2];

     for (int i = 0; i < 2; i++) {
         for (int j = 0; j < 2; j++) {
             System.out.printf("Elemento [%d][%d]: ", i, j);
             matriz[i][j] = sc.nextInt();
         }
     }

     int determinante = calcularDeterminante(matriz);
     System.out.printf("El determinante de la matriz es: %d\n", determinante);
 }

 public static int calcularDeterminante(int[][] matriz) {
     return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
 }
}

