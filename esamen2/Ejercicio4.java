package esamen2;

//Ejercicio 4: Intercambiar elementos en un array.
import java.util.Scanner;
public class Ejercicio4 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Introduce el tamaño del array: ");
     int n = sc.nextInt();

     int[] array = new int[n];
     System.out.println("Introduce los elementos del array:");
     for (int i = 0; i < n; i++) {
         System.out.print("Elemento " + i + ": ");
         array[i] = sc.nextInt();
     }

     System.out.print("Introduce la posición 1 a intercambiar: ");
     int pos1 = sc.nextInt();
     System.out.print("Introduce la posición 2 a intercambiar: ");
     int pos2 = sc.nextInt();

     intercambiar(array, pos1, pos2);

     System.out.println("Array después del intercambio: ");
     for (int num : array) {
         System.out.print(num + " ");
     }
 }

 public static void intercambiar(int[] array, int pos1, int pos2) {
     int temp = array[pos1];
     array[pos1] = array[pos2];
     array[pos2] = temp;
 }
}