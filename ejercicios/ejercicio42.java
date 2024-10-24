package ejercicios;

import java.util.Scanner;

public class ejercicio42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Voy a sacar un numero entre los siguientes numeros que introduzcas ");
		int min = sc.nextInt();
		int max = sc.nextInt();
		
		
		int aleat = (int)(Math.random()*(max-min+1)+min);
		
		System.out.println("El numero es "+ aleat);


	}

}
