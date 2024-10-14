package ejercicios;
import java.util.*;

public class ejercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PEDIR 10 NUMEROS Y DECIR SI HAY NEGATIVOS O NO
		Scanner sc = new Scanner(System.in);
		boolean hayNegativo = false;
		int cont = 0;
		while (cont < 10) {
            System.out.println("Ingresa un número: ");
            int numero = sc.nextInt();

            if (numero < 0) {
                hayNegativo = true;
            }
            cont++;
        }
		if (hayNegativo) {
        	System.out.println("Has introducido numeros negativos");
        } else {
        	System.out.println("No has introducido numeros negativo");
        }
	}

}
