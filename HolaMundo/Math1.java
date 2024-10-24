package HolaMundo;

import java.util.Scanner;

public class Math1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Voy a buscar un numero entre 1 y ");
		int max = sc.nextInt();
		int aleat = (int)(Math.random()*max+1);
		
		System.out.println("El numero es "+ aleat);

	}

}
