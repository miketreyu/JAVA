package ejercicios;
import java.util.*;

public class ejercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PEDIR NUMEROS DE EDADES
		// HACER UN BUCLE HASTA QUE LA MEDIA LLEGUE A 25
		int numero, cont, promedio, suma;
		Scanner sc = new Scanner(System.in);
		cont = 0;
		suma = 0;
		promedio = 0;
		
		do {
			System.out.println("ingrese un numero:");
			numero = sc.nextInt();
			suma = suma + numero;
			cont = cont +1;
			promedio=suma/cont;
			System.out.println("la media es"+promedio);
		   } while (promedio<25);
		System.out.println("se cierra el programa");
		

	}

}
