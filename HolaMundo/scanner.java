package HolaMundo;
import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AQUI VOY A IMPORTAR CON SCANNER
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		String nombre;
		nombre = sc.nextLine();
		System.out.println("Introduce tu edad: ");
		int edad = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduce tu DNI: ");
		String dni; 
		dni = sc.nextLine();
		System.out.println(nombre);
		System.out.println(edad);
		System.out.println(dni);

	}

}
