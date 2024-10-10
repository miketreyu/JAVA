package ejercicios;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HACER UN PROGRAMA DONDE 
		int mes;
		String texto;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el numero del mes:");
		mes = sc.nextInt();
		switch(mes) {
			case 1: texto = "Enero, tiene 31 días";
				break;
			case 2: texto = "Febrero, tiene 28 días";
				break;
			case 3: texto = "Marzo, tiene 31 días";
				break;
			case 4: texto = "Abril, tiene 30 días";
				break;
			case 5: texto = "Mayo, tiene 31 días";
				break;
			case 6: texto = "Junio, tiene 30 días";
				break;
			case 7: texto = "Julio, tiene 31 días";
				break;
			case 8: texto = "Agosto, tiene 31 días";
				break;
			case 9: texto = "Septiembre, tiene 30 días";
				break;
			case 10: texto = "Octubre, tiene 31 días";
				break;
			case 11: texto = "Noviembre, tiene 30 días";
				break;
			case 12: texto = "Diciembre, tiene 31 días";
				break;
			default: texto = "El número introducido no corresponde a ningún mes";
				break;
				
		} 
		System.out.println(texto);
		sc.close();

	}

}
