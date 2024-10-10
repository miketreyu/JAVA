package ejercicios;
import java.util.Scanner;

public class ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PEDIR UN NUMERO POR PANTALLA
		// SUMARLO CON TODOS SUS DIGITOS
		int suma, numero, part;
		System.out.println("Introduzca un numero: ");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		suma = 0;
		while (numero>0) {
            suma += (numero%10);
            numero /= 10;
		}
		System.out.println(suma);

	}

}
