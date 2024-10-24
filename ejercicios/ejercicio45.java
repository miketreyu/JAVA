package ejercicios;
import java.util.*;

public class ejercicio45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Realiza un programa que pida un número y construya por 
		// pantalla su pirámide.
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un numero:");
		int num = sc.nextInt();
		for (int alt=1;alt<=num;alt++) {
			for(int blanc=1;blanc<=alt-num;blanc++){
				System.out.print(" ");				
			}
			for(int aste=1;aste<=(2*alt)-num;aste++) {
				System.out.print("*");
			}
			System.out.println();
		
		}

	}

}
