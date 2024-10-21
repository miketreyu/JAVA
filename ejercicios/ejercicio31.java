package ejercicios;
import java.util.*;

public class ejercicio31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HACER UN PROGRAMA QUE ADIVINE UN NUMERO DEL 1 AL 100
		// SI ES MAYOR QUE EL QUE PIENSAS, SE LO INDICAS, Y VICEVERSA

	        Scanner entrada = new Scanner(System.in);

	        int num, max, min, anterior;
	        boolean seguir;
	        char respuesta;

	        seguir = true;
	        max = 100;
	        min = 1;
	        anterior = 0;

	        while (seguir) // Equivalente a (seguir == true)
	        {
	            num = (max + min) / 2;

	            if (num == anterior) {
	                num++;
	            } // Entender para que se utiliza.

	            System.out.print("El número es " + num + "? (Escribe: =, < o >): ");
	            respuesta = entrada.nextLine().charAt(0); // Leemos un caracter.

	            switch (respuesta) {
	                case '<':
	                    max = num;
	                    anterior = num;
	                    break;
	                case '=':
	                    seguir = false;
	                    break;
	                case '>':
	                    min = num;
	                    anterior = num;
	                    break;
	            }
	        }

	        System.out.println("Lo acerte!!");

	}

}
