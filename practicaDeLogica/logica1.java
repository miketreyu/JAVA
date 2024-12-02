package practicaDeLogica;
import java.util.*;

public class logica1 {
	
	// FUNCION SUMA
	public static int suma(int n1, int n2) {
		return n1+n2;
	}
	
	// FUNCION QUE TE DICE SI UN NUMERO ES PAR O NO
	public static boolean esPar(int numero) {
		if(numero%2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	// FUNCION QUE TE DA LA MEDIA DE 3 NUMEROS
	public static float media(float n1, float n2, float n3) {
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextFloat();
		n2 = sc.nextFloat();
		n3 = sc.nextFloat();
		return (n1+n2+n3)/3;		
	}
	
	// FUNCION QUE TE DESPLEGA UN MENU DE CALCULADORA CON SUMA, MULTIPLICACION Y DIVISION DE DOS NUMEROS
	public static float calculadora(float n1, float n2) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entregame dos numeros: ");
		n1 = sc.nextFloat();
		n2 = sc.nextFloat();
		int a = 1;
		while (a<2)
	      {  switch(a){
	            case 1:
	               float suma=n1+n2;
	               System.out.println("La suma es: "+ suma);
	               break;

	            case 2:
	               float multiplicacion = n1*n2;
	               System.out.println("La multiplicacion es: " + multiplicacion); 
	               break;

	            case 3:
	               float division = n1/n2;
	               System.out.println("La division es: " + division);
	               break;
	       }
	     }
		return a;
	}
	
	// FUNCION QUE TE DICE SI UN NUMERO ES POSITIVO O NEGATIVO
	public static boolean esPositivo(int numero) {
		if(numero > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	// FUNCION QUE TE DEVUELVE LA TABLA DE MULTIPLICAR
	public static int tablaMultiplicar(int numero) {
		int cont=1;
		for(int i=0; i<10; i++) {
			numero = numero*cont;
			cont++;
		}
		return numero;
	}
	
	// FUNCION QUE TE DEVUELVE LA FACTORIAL DE UN NUMERO
	public static int factorial(int numero) {
		int cont=1;
		Scanner sc = new Scanner(System.in);
		int factorizar = sc.nextInt();
		for(int i=0; factorizar == 0; i++) {
			factorizar= (numero-cont);
			resultado = resultado*factorizar;
			cont++;
		}
		return numero;
	}

}
