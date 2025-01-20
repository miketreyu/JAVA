package esamen2;

//Ejercicio 1: Determinar si un número es múltiplo de otro.
import java.util.Scanner;
public class Ejercicio1 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Introduce el primer número: ");
     int num1 = sc.nextInt();
     System.out.print("Introduce el segundo número: ");
     int num2 = sc.nextInt();

     if (esMultiplo(num1, num2)) {
         System.out.println(num1 + " es múltiplo de " + num2);
     } else {
         System.out.println(num1 + " no es múltiplo de " + num2);
     }
 }

 public static boolean esMultiplo(int a, int b) {
     return a % b == 0;
 }
}