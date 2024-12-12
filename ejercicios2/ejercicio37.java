package ejercicios2;

public class ejercicio37 {
	
	public static int factorial(int n) {
		if (n==1) {
			return n; 
		}
		else {
			return n+factorial(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int fact = factorial(n);
		System.out.println(fact);

	}

}
