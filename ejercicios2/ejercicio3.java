package ejercicios2;
import java.util.*;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PROGRAMA QUE DIGA TIRADA DE LA MAQUINA
		// OBTIENE EL RESULTADO DE TIRAR DOS DADOS
		// MOSTRARÁ RESULTADO DE 1 A 6
		int ro1, ro2, ru1, ru2, max, cont;
		max = 6;
		cont = 0;
		
		while(cont != 2 && cont != -2) {
		System.out.println("Tirada de la maquina ");
		ro1 = (int)(Math.random()*max+1);
		ro2 = (int)(Math.random()*max+1);
		System.out.println("Mis resultados son " + ro1 + " y " + ro2 + " cuya suma es " +(ro1+ro2));
		
		System.out.println("Tirada jugador, pulse enter ");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		ru1 = (int)(Math.random()*max+1);
		ru2 = (int)(Math.random()*max+1);
		System.out.println("Tus resultados son " + ru1 + " y " + ru2 + " cuya suma es " +(ru1+ru2));
		
		if ((ru1+ru2)<(ro1+ro2)) {
			System.out.println("Gana la maquina");
			cont--;
		}else if((ru1+ru2)>(ro1+ro2)){
			System.out.println("Gana el usuario");
			cont++;
		}else {
			System.out.println("Empate");;
		}
		
		if(cont==2) {
			System.out.println("Gana el usuario!");
		}else if(cont==-2){
			System.out.println("Gana la maquina!");
		}
		}
		
		

	}

}
