package ejercicios;
import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//REALIZA UN PROGRAMA QUE PASE DE GRADOS A FARENHEIT
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique los grados: ");
		int celsius = sc.nextInt();
		int farenheit = 32 + ((9 * celsius)/5);
		System.out.println("Son " + farenheit + (" grados farenheit"));

	}

}
