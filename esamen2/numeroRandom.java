package esamen2;
import java.util.*;

public class numeroRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	public static int generarNumero(int minimo, int maximo) {
		
		return (int)Math.floor(Math.random()*(minimo-(maximo+1))+ (maximo)+1);
	}
	public static double aleatorio() {
		double aleat = Math.random();
		return aleat;
	}
	public static int getRandom(int min, int max) {

		int range = (max - min) + 1;
     		int random = (int) ((range * Math.random()) + min);
		return random;
	}

}
