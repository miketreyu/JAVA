package HolaMundo;
import java.util.*;

public class bucleIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1, numero2;
		short operacion;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer numero:");
		numero1 = sc.nextInt();
		System.out.println("Introduce el segundo numero:");
		numero2 = sc.nextInt();
		System.out.println("Qué operacion quieres realizar? 0-suma / 1-resta");
		operacion = sc.nextShort();
		if(operacion==0)
		{
			int suma = numero1+numero2;
			System.out.println("La suma es:" + suma);
		}else {
			int resta = numero1 - numero2;
			System.out.println("La resta es: " + resta);
		}
	}

}
