package ejercicios;
import java.util.*;

public class ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PEDIR UN NUMERO
		// HACER UN MODULO DE 2
		// INDICAR SI ES PAR O NO
		System.out.println("Introduzca un numero:");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		if (numero%2==0){
			System.out.println("El numero es par.");
		}else {
		System.out.println("El numero es impar.");
		}

	}

}
