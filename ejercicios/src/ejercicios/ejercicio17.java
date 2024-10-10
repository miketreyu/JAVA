package ejercicios;
import java.util.*;

public class ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PEDIR UN NUMERO Y CALCULAR SI ES UN AÑO BISIESTO
		// DIVISIBLE ENTRE 100, PERO NO ENTRE 400, Y UNA VEZ CADA 4 AÑOS
		int bisiesto;
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe un año");
		bisiesto = sc.nextInt();
		if (bisiesto %4 == 0 && !(bisiesto %100 == 0 && bisiesto %400 != 0) ) {
			System.out.println(bisiesto + " es bisiesto");
		}else {
			System.out.println(bisiesto + " no es bisiesto");
		}

	}

}
