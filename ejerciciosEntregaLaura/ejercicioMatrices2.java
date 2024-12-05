package ejerciciosLaura1;
import java.util.*;

public class ejercicioMatrices2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Necesitamos un programa que guarde un string array en una matriz dividiendolo por espacios
		
		System.out.println("Digame una frase: ");
		Scanner sc = new Scanner(System.in); // Aquí pedimos una frase
		String frase = sc.nextLine(); // Aquí guardamos la frase en un string
		String[] palabra = frase.split(" "); // Aquí separamos la frase por espacios
		String [][] matriz = new String[palabra.length][]; // Aquí asignamos la cantidad de filas a la longitud de la frase dentro de la matriz
		
		for(int i = 0; i < palabra.length; i++) {
			matriz[i]=palabra[i].split("");
		}
		System.out.println(Arrays.deepToString(matriz));
	}

}
