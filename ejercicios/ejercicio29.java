package ejercicios;

public class ejercicio29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PROGRAMA QUE SUME INDEPENDIENTEMENTE LOS NUMEROS PARES Y LOS IMPARES
		// MUESTRALO POR PANTALLA
		int par, impar;
		par=0;
		impar=0;
		for (int i = 100; i <= 200; i++) {
			if (i%2==0) {
				par=par+i;
			}else {
				impar=impar+i;
			}
		}
		System.out.println("La suma par es " + par + " y la suma impar es " + impar);

	}

}
