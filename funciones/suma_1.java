package funciones;
import java.util.*;

public class suma_1 {
	
	public static int suma(int n, int m) {
		return n+m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SUMA DE DOS NUMEROS
		System.out.println("introduce dos numeros:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		
		System.out.println(suma(n,m));
		
		

	}

}
