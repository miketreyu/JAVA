package ejercicios;
import java.util.*;

public class ejercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("¿Cuantos numeros quieres introducir?");
		int cont, numero, numero2;
		Scanner sc = new Scanner(System.in);
		cont = 0;
		numero = sc.nextInt();
		numero2 = 0;
		double media = 0;
		int suma = 0;
		while (cont<numero) { 
			System.out.println("Introduzca otro numero: ");
			numero2 = sc.nextInt();
			cont ++;
			suma = suma + numero2;
		}
		media = suma/numero;
		System.out.println("La media es: " + media);
		sc.close();
		
		/*bucle for
		 * for (int i = 1; i<numero;i++)
		 * {
		 * 		System.out.println("Introduzca otro numero: ");
		 * 		numero2 = sc.nextInt();
		 * 		suma=suma+numero2;//suma+=numero2;
		 * }
		 */
		

	}

}
