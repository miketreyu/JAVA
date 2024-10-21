package ejercicios;
import java.util.*;

public class ejercicio36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crea un programa que pida dos cadenas de texto por teclado 
		// y luego indique si son iguales,
		// además de si son iguales sin diferenciar 
		// entre mayúsculas y minúsculas.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el nombre: ");
		String nom1 = sc.next();
		System.out.print("Introduce el segundo nombre: ");
		String nom2 = sc.next();
		System.out.println(nom1.equalsIgnoreCase(nom2)); 


	}

}
