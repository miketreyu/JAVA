package ejercicios;
import java.util.*;

public class ejercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PEDIR NUMEROS HASTA QUE INTRODUZCA UN 0
		// SI HAY NEGATIVOS, INDICA LA CANTIDAD DE NEGATIVOS Y DE POSITIVOS
		Scanner sc = new Scanner(System.in);
		int numero, cont1, cont2;
		cont1=0;
		cont2=0;
		boolean hayNegativo = false;
		do {
            System.out.println("Ingresa un número: ");
            numero = sc.nextInt();
            if (numero>0) {
            	cont1++;
            } else {
            	cont2++;
            }
            if (numero < 0) {
                hayNegativo = true;
            }
        } while (numero != 0);
		if (hayNegativo) {
        	System.out.println("Has introducido numeros negativos");
        } else {
        	System.out.println("No has introducido numeros negativo");
        }
		System.out.println("Hay " + cont1 + " positivos y " +cont2+" negativos.");
	}

}