package esamen2;

//Ejercicio 3: Sumar elementos de una matriz y calcular la media.
import java.util.Scanner;
public class Ejercicio3 {
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
             System.out.print("Elemento [" + i + "][" + j + "]: ");
             matriz[i][j] = sc.nextInt();
         }
     }

     int suma = 0;
     for (int i = 0; i < filas; i++) {
         for (int j = 0; j < columnas; j++) {
             suma += matriz[i][j];
         }
     }
     double media = (double) suma / (filas * columnas);

     System.out.println("La suma de los elementos es: " + suma);
     System.out.println("La media de los elementos es: " + media);
 }
}