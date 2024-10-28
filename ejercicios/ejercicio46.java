package ejercicios;
import java.util.*;

public class ejercicio46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crea un programa que pida diez números reales por teclado, 
		// los almacene en un array, y luego
		// muestre la suma de todos los valores.
		double valores[] = new double[10];
		Scanner sc = new Scanner(System.in);
		double suma = 0;
		for (int i=0; i<valores.length;i++) {
			System.out.println("Introduce el numero " + i + ":");
			valores[i]=sc.nextDouble();
		}
		for (int i=0; i<valores.length;i++) {
			suma +=valores[i];
			//suma = suma+valores[i];
		}
		System.out.println("La suma es " + suma);
		
		
		

	}

}
