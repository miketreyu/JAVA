package ejercicios;
import java.util.*;

public class ejercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PEDIR NUMEROS EN BUCLE
		// CERRAR CUANDO LLEGUE -1
		// BOOLEAN SI SE IMPRIME 10
		int nota;
		boolean diez = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa una nota del 1 al 10: ");
        nota = sc.nextInt();
        if (nota>10||nota<-1) {
        	System.out.println("Has introducido un numero invalido");
        	System.out.println("Ingresa una nota del 1 al 10: ");
        	nota = sc.nextInt();
        }
        while (nota!=-1) {
        	System.out.println("Ingresa una nota del 1 al 10: ");
        	nota = sc.nextInt();
        	if (nota>10||nota<-1) {
            	System.out.println("Has introducido un numero invalido");
            	System.out.println("Ingresa una nota del 1 al 10: ");
            	nota = sc.nextInt();
        	}
        	if (nota == 10) {
                diez = true;
        	}
        }
        	if (diez) {
            	System.out.println("Has introducido el numero 10");
        	}

	}

}
