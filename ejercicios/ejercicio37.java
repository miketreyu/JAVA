package ejercicios;

import java.util.Scanner;

public class ejercicio37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crea un programa que pida por teclado tres 
		// cadenas de texto: nombre y dos apellidos. Luego
		// mostrará un código de usuario (en mayúsculas) 
		// formado por la concatenación de las tres
		// primeras letras de cada uno de ellos. 
		// Por ejemplo si se introduce “Lionel”, “Tarazón” y
		// “Alcocer” mostrará “LIOTARALC”.

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el nombre: ");
		String nombre = sc.next();
		System.out.print("Introduce el primer apellido: ");
		String apellido1 = sc.next();
		System.out.print("Introduce el segundo apellido: ");
		String apellido2 = sc.next();
		
        String parte1 = nombre.substring(0, 3).toUpperCase();
        String parte2 = apellido1.substring(0, 3).toUpperCase();
        String parte3 = apellido2.substring(0, 3).toUpperCase();
        System.out.println(parte1+parte2+parte3);
	}

}
