package HolaMundo;

public class Parametros {
	public static void imprimeDoble(int b)
	{
		b = 2*b;
		System.out.println("valor de la funcion"+b);
	}
	
	public static void sumaXAlVector(int a[], int n) 
	{
		for(int i=0; i<a.length; i++) {
			a[i]= a[i]+n;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		System.out.println("valor inicial"+a);
		imprimeDoble(a);
		System.out.println("valor despues de la funcion"+a);
		
		int array[] = {0,1,2,3};
		System.out.println();

	}

}
