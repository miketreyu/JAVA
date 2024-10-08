package ejercicios;
import java.util.*;

public class ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HAZ UN PROGRAMA QUE PIDA UN NUMERO ENTERO POSITIVO
		// EL PROGRAMA DEBE ESCRIBIR LOS NUMEROS QUE HAYA DESDE 1 HASTA EL INDICADO
		// SE DEBE CONTROLAR SI ES 0 O MENOR
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero mayor que 0:");
		int numero;
		numero = sc.nextInt();
		if(numero<=0) {
			System.out.println("El numero debe ser mayor que 0");
		}else {
			int cont = 1;
			while (cont<=numero) {
				System.out.println(cont + "");
				cont++;
			}
		}
		
		
		sc.close();
	}

}
