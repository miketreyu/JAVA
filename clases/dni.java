package clases;
import java.util.*;

public class dni {
	static Scanner leer = new Scanner(System.in);
	int numeroDNI;
	int longitud;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Indicame tu numero de DNI: ");
		
		if(longitud==8) 
		{
			modDNI(numeroDNI);
			
		}
		else 
		{
			System.out.println("El numero entregado no encaja con la longitud del DNI.");
		}
		

	}
	public static int 
	public static int modDNI (int numeroDNI) 
	{
		return numeroDNI%23;
	}
	public static char letra(int modDNI(numeroDNI)) 
	{
		
	}
}
}
