package ejercicios;

import java.util.Scanner;

public class ejercicio43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Partir una frase en 4 partes
		// Partir una frase en dos. A continuación partir 
		// cada una de las dos mitades en otras dos.
		// Mostrar las cuatro partes. (Si en cualquier división 
		// el número es impar la segunda
		// mitad tendrá un carácter más). 
		// Probarlo con “Esta es la frase que vamos a partir en cuatro”
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba una frase:");
		String frase = sc.nextLine();
		int fraselen = frase.length();
		String mitad1= frase.substring(0,fraselen/2);
		String mitad2= frase.substring(fraselen/2,fraselen);
		int mitadlen1 = mitad1.length();
		String cuarto1= mitad1.substring(0,mitadlen1/2);
		String cuarto2= mitad1.substring(mitadlen1/2);
		int mitadlen2 = mitad2.length();
		String cuarto3= mitad2.substring(0,mitadlen2/2);
		String cuarto4= mitad2.substring(mitadlen2/2);
		
		System.out.println(mitad1);
		System.out.println(mitad2);
		System.out.println(cuarto1);
		System.out.println(cuarto2);
		System.out.println(cuarto3);
		System.out.println(cuarto4);
		


	}

}
