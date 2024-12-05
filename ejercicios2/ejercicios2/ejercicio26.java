package ejercicios2;

import java.util.Scanner;

public class ejercicio26 {
	
	/*
	 9. Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el más
		elevado. Impleméntalo creando únicamente una función a la que le pasemos dos valores (no tres)
		y nos devuelva el máximo de los dos valores.  
	 */
	public static int numMax(int n1, int n2) {
		if(n1>n2) {
			return n1;
		}else {
			return n2;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tres numeros: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int o = sc.nextInt();
		int max1 = numMax(m, n);
		int max2 = numMax(max1, o);
		System.out.println("El numero mayor es: " + max2);
		

	}

}
