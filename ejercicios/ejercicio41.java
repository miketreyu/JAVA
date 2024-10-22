package ejercicios;
import java.util.*;

public class ejercicio41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Realiza un programa que lea una frase por teclado e 
		// indique si la frase es un palíndromo o no
		// (ignorando espacios y sin diferenciar entre mayúsculas 
		// y minúsculas). Supondremos que el
		// usuario solo introducirá letras y espacios (ni comas, 
		// ni puntos, ni acentos, etc.). Un palíndromo
		// es un texto que se lee igual de izquierda a derecha 
		// que de derecha a izquierda. Por ejemplo:
		// Amigo no gima
		// Dabale arroz a la zorra el abad Amo
		// la pacífica paloma
		
		boolean palindromo = true;
		System.out.println("Introduce una frase:");
		Scanner sc = new Scanner(System.in);
		String frase;
		frase = sc.nextLine();
		frase = frase.replace(" ", "");
		frase = frase.toUpperCase();
		int longitud = frase.length();
		
		for(int i = 0; i < longitud && palindromo; i++) {
			if(frase.charAt(i) != frase.charAt((longitud-1) - i)) {
				palindromo = false;
			}
		}
		if (palindromo) {
			System.out.println("La frase es palindromo");
		} else {
			System.out.println("La frase no es palindromo");
		}
	}

}
