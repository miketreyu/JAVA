package HolaMundo;
import java.util.*;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// EL SWITCH SIRVE COMO UN IF PERO PARA HACER CAMBIOS EN EL 
		// FUNCIONAMIENTO DEL PROGRAMA MIENTRAS SE EJECUTA
		int dia;
		String texto;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce el numero del día de la semana:");
		dia = sc.nextInt();
		switch(dia) {
			case 1: texto = "Lunes";
				break;
			case 2: texto = "Martes";
				break;
			case 3: texto = "Miercoles";
				break;
			case 4: texto = "Jueves";
				break;
			case 5: texto = "Viernes";
				break;
			case 6: texto = "Sabado";
				break;
			case 7: texto = "Domingo";
				break;
			default: texto = "El numero es incorrecto";
				break;
				
		} 
		System.out.println(texto);
		sc.close();

	}

}
