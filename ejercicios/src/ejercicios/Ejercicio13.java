package ejercicios;
import java.util.*;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LEER DOS NUMEROS
		// HACER LA DIVISION
		// COMPROBAR SI ES UN NUMERO REAL O NO
		System.out.println("Introduzca un numero:");
		Scanner sc = new Scanner(System.in);
		double numero = sc.nextInt();
		System.out.println("Introduzca otro numero:");
		double numero2 = sc.nextInt();
		double division = numero/numero2;
		if (division==1) {
			System.out.println("El numero es real");
		}else {
			System.out.println("El numero es irreal");
		}
		
		
	}

}
