package ejercicios;
import java.util.*;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DEBEMOS PEDIR LA FECHA DE CUMPLEAÑOS EN NUMEROS
		//DEBEMOS SUMAR TODOS LOS DIGITOS
		//DEBEMOS SACAR EL RESTO DE CADA NUMERO
		//DEBEMOS SUMAR TODOS LOS NUMEROS Y ESO NOS DARÁ EL NUMERO DE LA SUERTE
		Scanner sc = new Scanner(System.in);
		int dia, mes, anio, suma, num1, num2, num3, num4, resto1, resto2, resto3, suerte;
		System.out.println("Por favor, indique su día de nacimiento:");
		dia = sc.nextInt();
		System.out.println("Por favor, indique su mes de nacimiento en valor numerico:");
		mes = sc.nextInt();
		System.out.println("Por favor, indique su año de nacimiento:");
		anio = sc.nextInt();
		suma = dia + mes + anio;
		num1 = suma/1000;
		resto1 = suma%1000;
		num2 = resto1/100;
		resto2 = resto1%100;
		num3 = resto2/10;
		resto3 = resto2%10;
		num4 = resto3%10;		
		suerte = num1 + num2 + num3 + num4;
		System.out.println("Tu número de la suerte es: " + suerte);
		
		

	}

}
