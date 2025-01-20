package esamen2;

//Ejercicio 2: Crear un triángulo de caracteres invertido.
import java.util.Scanner;
public class Ejercicio2 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Introduce un carácter: ");
     char c = sc.next().charAt(0);
     System.out.print("Introduce el número de líneas: ");
     int lineas = sc.nextInt();

     imprimirTrianguloInvertido(c, lineas);
 }

 public static void imprimirTrianguloInvertido(char c, int lineas) {
     for (int i = lineas; i > 0; i--) {
         for (int j = 0; j < i; j++) {
             System.out.print(c);
         }
         System.out.println();
     }
 }
}