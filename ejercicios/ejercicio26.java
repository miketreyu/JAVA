package ejercicios;
import java.util.Scanner;

public class ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int cont1, cont2;
        cont1 = 0;
        cont2 = 0;
        

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un número:");
            numeros[i] = sc.nextInt();
            if (numeros[i]>0) {
            	cont1++;
            } else {
            	cont2++;
            }

        }
        System.out.println("Has introducido " + cont1 + " positivos y " + cont2 + " negativos");
        

        sc.close();
    }
}
