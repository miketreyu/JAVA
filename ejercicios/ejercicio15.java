package ejercicios;
import java.util.*;

public class ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HACER UN PROGRAMA QUE PIDA LAS HORAS, LOS MINUTOS Y LOS SEGUNDOS,
		// SI ES UN NUMERO QUE NO ENTRA DENTRO DE LAS 23:59:59 DECIR MUESTRA UN VALOR VALIDO
		int hora, minuto, segundo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba una hora:");
		hora = sc.nextInt();
		System.out.println("Escriba un minuto:");
		minuto = sc.nextInt();
		System.out.println("Escriba un segundo:");
		segundo = sc.nextInt();
		if (hora >= 0 && hora < 24 &&
			minuto >= 0 && minuto < 60 &&
			segundo >= 0 && segundo < 60) {
			System.out.println(hora+":"+minuto+":"+segundo);
	}else {
		System.out.println("La hora es incorrecta");
	}
	}

}
