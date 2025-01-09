package funciones;
import java.util.*;

public class piramide_de_letras{

	public static void imprimirPiramide(char letraBase) {
		for (char iletra = 'A'; iletra <= letraBase; iletra++) {
			for (int menos = 1; menos <= letraBase; menos++) {
				System.out.print("-"); 
			}
        
			char letra = letraBase;
			for (int i = 1; i <= (iletra * 2) - 1; i++) {
				System.out.print(iletra);


			}
			for (int menos = 1; menos <= letraBase; menos++) {
				System.out.print("-"); 
			}
        
			System.out.println();
		}
	}
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Introduzca la letra base: ");
	        char letra = sc.nextLine().charAt(0);
	        char letraMayus = Character.toUpperCase(letra);
	        imprimirPiramide(letraMayus);
	    }
}

