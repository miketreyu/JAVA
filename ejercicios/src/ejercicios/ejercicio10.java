package ejercicios;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HACER UN PROGRAMA DONDE PIDO UN NUMERO
		//EL NUMERO TENGO QUE DIVIDIRLO EN TODOS SUS NUMEROS. EJEM: 123, 1, 2, 3.
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique un entero de tres cifras: ");
		int entero, entero1, entero2, entero3, resto;
		entero = sc.nextInt();
		entero1 = entero/100;
		resto = entero%100;
		entero2 = resto/10;
		entero3 = resto%10;
		System.out.println("Los numeros son " + entero1 + " " + entero2 + " "+ entero3);

	}

}
