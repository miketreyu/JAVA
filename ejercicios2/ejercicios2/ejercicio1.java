package ejercicios2;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crea un programa que pida dos valores enteros P y Q, 
		// luego cree un array que contenga todos
		// los valores desde P hasta Q, y lo muestre por pantalla.
		Scanner sc= new Scanner(System.in);
		System.out.println("Introudce el tamaño mínimo: ");
		int tamanomin = sc.nextInt();
		System.out.println("Introduce el tamaño máximo: ");
		int tamanomax= sc.nextInt();
		int tam= tamanomax-tamanomin+1;
		int array[]=new int [tam];
		for(int i =0; i<array.length;i++)
		{
			array[i]=tamanomin+i;
			System.out.println(array[i]);
		}

	}

}
