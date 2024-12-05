package ejercicios2;
import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crea un programa que cree un array de enteros de tamaño 100 
		// y lo rellene con valores enteros
		// aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). 
		// Luego pedirá un valor N y mostrará en
		// qué posiciones del array aparece N. 
		int array[]=new int [100];
		for(int i =0; i<array.length;i++)
		{
			int aleat = (int)(1 + Math.random()*10);
			array[i]= aleat-array[i];
			System.out.println(array[i]);
		}

	}

}
