package ejercicios;
import java.util.*;

public class ejercicio47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crea un programa que pida diez números reales por teclado, 
		// los almacene en un array, y luego
		// lo recorra para averiguar el máximo y mínimo 
		// y mostrarlos por pantalla.
		double valores[]= new double[10];
		Scanner sc= new Scanner(System.in);
		for (int i=0; i<valores.length; i++)
		{
			System.out.println("Introduce un número: ");
			valores[i]=sc.nextDouble();
		}
		double max = valores[0], min=valores[0];
		for(int i=1; i<valores.length;i++)
		{
			if(valores[i]>max)
			{
				max= valores[i];
			}
			else if(valores[i]<min)
			{
				min=valores[i];
			}
		}
		System.out.println("El máximo es: "+ max);
		System.out.println("El mínimo es: "+ min);
		
	}

}
