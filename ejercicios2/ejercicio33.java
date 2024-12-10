package ejercicios2;
import java.util.*;

public class ejercicio33 {

    public static void holaMundo(int n, int cont) {
        if (cont >= n) {
            return;  
        }

        System.out.println("Hola mundo");

        holaMundo(n, cont + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de veces que desea imprimir 'Hola Mundo': ");
        int n = sc.nextInt();

        holaMundo(n, 0);
    }
}

