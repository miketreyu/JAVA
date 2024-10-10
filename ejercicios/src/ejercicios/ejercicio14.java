package ejercicios;
import java.util.*;

public class ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PIDE TRES NUMEROS POR PANTALLA Y CALCULA EL MAYOR DE LOS 3
		int numero1, numero2, numero3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		numero1 = sc.nextInt();
		System.out.println("Introduzca otro numero: ");
		numero2 = sc.nextInt();
		System.out.println("Introduzca otro numero: ");
		numero3 = sc.nextInt();
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("El numero mayor es " + numero1);
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("El numero mayor es " + numero2);
		} else if (numero3 > numero1 && numero3 > numero2) {
			System.out.println("El numero mayor es " + numero3);
		} else {
			System.out.println("Hay dos o mas numeros iguales");
		}
		
		
		

	}

}
