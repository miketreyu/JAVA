package ejercicios;
import java.util.*;

public class ejercicio40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crea un programa que muestre por pantalla cuantas 
		// vocales de cada tipo hay (cuantas ‘a’,
		// cuantas ‘e’, etc.) en una frase introducida por teclado. 
		// No se debe diferenciar entre mayúsculas
		// y minúsculas. Por ejemplo dada la frase “Mi mama me mima” 
		// dirá que hay: Nº de A's: 3 Nº de
		// E's: 1
		// Nº de I's: 2
		// Nº de O's: 0
		// Nº de U's: 0
		
		System.out.println("Escribe una frase: ");
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		int contadorA=0;
		int contadorE=0;
		int contadorI=0;
		int contadorO=0;
		int contadorU=0;
		frase = frase.toLowerCase();
		for(int contador = 0; contador < frase.length(); contador++) {
			switch (frase.charAt(contador)){
	        case 'a':  contadorA++ ;
	                 break;
	        case 'e':  contadorE++ ;
	                 break;
	        case 'i':  contadorI++ ;
            		 break;
	        case 'o':  contadorO++ ;
            		 break;
	        case 'u':  contadorU++ ;
            		 break;
			}
		}
		System.out.println("Hay "+ contadorA+" 'a', "+contadorE+"'e', "+contadorI+"'i', "+contadorO+"'o' y "+contadorU+"'u'.");
	}
}
		
	


