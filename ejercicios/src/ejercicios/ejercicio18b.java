package ejercicios;
import java.util.*;

public class ejercicio18b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HAZ UN PROGRAMA QUE PIDA UN NUMERO ENTERO POSITIVO
		// EL PROGRAMA DEBE ESCRIBIR LOS NUMEROS QUE HAYA DESDE 1 HASTA EL INDICADO
		// SE DEBE CONTROLAR SI ES 0 O MENOR
		// ESTE EJERCICIO SERA CON DO/WHILE
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero mayor que 0:");
		int numero;
		numero = sc.nextInt();
		if(numero<=0) 
		{
			System.out.println("El numero debe ser mayor que 0");
		}
		else 
		{
			int cont = 1;
			do 
			{
				System.out.println(cont + "");
				cont++;
			}while (cont<=numero);
			
		
		
		
		sc.close();
		}
	}

}
