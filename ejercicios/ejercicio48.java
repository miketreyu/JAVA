package ejercicios;
import java.util.*;

public class ejercicio48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crea un programa que pida dos valores enteros N y M, 
		// luego cree un array de tamaño N,
		// escriba M en todas sus posiciones y lo muestre por pantalla
		Scanner sc= new Scanner(System.in);
		System.out.println("Introudce el tamaño del array: ");
		int tamano = sc.nextInt();
		System.out.println("Introduce el valor a guardar: ");
		int valor= sc.nextInt();
		int array[]=new int [tamano];
		for(int i =0; i<array.length;i++)
		{
			array[i]= valor;
			System.out.println("El valor de la posicion " + i + "es "+ array[i]);
		}
		
	}

}
