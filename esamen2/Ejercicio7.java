package esamen2;

//Ejercicio 7: Generar un triángulo de Pascal recursivamente.
import java.util.Scanner;
public class Ejercicio7 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Introduce el número de filas para el triángulo de Pascal: ");
     int n = sc.nextInt();

     for (int i = 0; i < n; i++) {
         for (int j = 0; j <= i; j++) {
             System.out.printf("%d ", calcularCoeficiente(i, j));
         }
         System.out.println();
     }
 }

 public static int calcularCoeficiente(int fila, int columna) {
     if (columna == 0 || columna == fila) {
         return 1;
     }
     return calcularCoeficiente(fila - 1, columna - 1) + calcularCoeficiente(fila - 1, columna);
 }
}
