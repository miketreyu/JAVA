package ejercicios;
import java.util.*;

public class ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HAZ UN PROGRAMA QUE PIDA UN NUMERO HASTA 10 VECES
		// ESE NUMERO SE SUMARA
		// EN UN BUCLE
		
		Scanner sc = new Scanner(System.in);
		int numero, cont, suma;
		cont = 1;
		suma = 0;
		while(cont<=10)
			{
				System.out.println("Introduzca un numero:");
				numero = sc.nextInt();
				suma+=numero;
				cont++;
			}	
		System.out.println("El numero es: "+ suma);
		System.out.println("La media es: " + ((double) suma)/cont);
		
		
		sc.close();
		}

}
