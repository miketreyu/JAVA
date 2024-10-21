package ejercicios;
import java.util.*;

public class ejercicio39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Obtener qué tres caracteres hay en las 
		// posiciones 0, 13 y 18 de una frase, probar con "En un
		// lugar de la Mancha"
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una frase de mas de 18 caracteres:");
		String mifrase = sc.nextLine();
		char a = mifrase.charAt(0);
		char b = mifrase.charAt(13);
		char c = mifrase.charAt(18);
		
		System.out.println("Las posiciones 0, 13 y 18 son: " + a + ", " + b + ", " + c + ", ");
		

	}

}
