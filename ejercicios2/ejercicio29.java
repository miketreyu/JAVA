package ejercicios2;
import java.util.*;

public class ejercicio29 {
	/*
	19. Realiza un programa que permita comprobar si una terna de valores enteros (3 valores) se ajusta
	a la ecuación de Pitágoras: x ² + y ² = z ². El programa solicita al usuario los valores x, y, z. Se
	deberá crear una función a la que se le pase x, y, z y devuelva si son iguales o no. Por ejemplo: 3
	² + 4 ² = 5 ². 
	*/
	
	public static boolean esIgual(int x, int y, int z) {
		if((x*x)+(y*y)==(z*z)) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Escriba tres numeros del teorema de pitagoras: ");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		boolean d = esIgual(a,b,c);
		
		System.out.println(d);

	}

}
