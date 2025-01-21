package funciones;
import java.util.*;

public class par_o_impar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Diga un numero para saber si es par o impar: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (par_o_impar_(num)==0) {
			System.out.println("El numero es par");
		}
		else {
			System.out.println("El numero es impar");
		}
		

	}
	public static int par_o_impar_ (int num) {
		return num%2;
	}

}
