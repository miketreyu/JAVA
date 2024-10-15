package ejercicios;
import java.util.*;

public class ejercicio30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HACER LA POTENCIA DE A, POR EL NUMERO DE VECES DE B, PERO CON UN BUCLE
		int a, b, i, potencia;
		System.out.println("Ingrese dos numeros");
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		a = sc1.nextInt();
		b = sc2.nextInt();
		potencia=1;
		for(i=0; i<b; i++) {
			potencia=potencia*a;
		}
		System.out.println(potencia);

	}

}
