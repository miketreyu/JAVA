package ejercicios;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PEDIR INT AL USUARIO
		//DECIR SI ES PAR, IMPAR, POSITIVO, NEGATIVO, MULTIPLO DE 5, DE 10 Y SI ES MAYOR O MENOR DE 100
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique un entero: ");
		int entero = sc.nextInt();
		System.out.println((entero >=0)?"Es positivo ":"Es negativo");
		System.out.println((entero%2==0)?"Es par ":"Es impar ");
		System.out.println((entero%5==0)?"Es multiplo de 5 ":"No es multiplo de 5 ");
		System.out.println((entero%10==0)?"Es multiplo de 10 ":"No es multiplo de 10 ");
		System.out.println((entero >=100)?"Es mayor que 100":"Es menor que 100");
	}

}
