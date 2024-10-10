package HolaMundo;
import java.util.*;

public class BucleIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AQUI VOY A HACER UN BUCLE CON UN IF
		double nota = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una nota:");
		nota = sc.nextDouble();
		if(nota>=5) 
		{
			System.out.println("El alumno está aprobado.");
		}
		
	}
}

