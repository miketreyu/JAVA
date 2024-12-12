package ejercicios2;

public class ejercicio35 {
	
	public static int sumaDigitos(int n) {
        if (n <= 9) {
        	System.out.print(n+" = ");
            return n;
        }
        else
        {
        	System.out.print(n%10+" + ");
            return ((n % 10) + sumaDigitos(n/10));
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5789;
		int resultado = sumaDigitos(n);
		System.out.print(resultado);

	}

}
