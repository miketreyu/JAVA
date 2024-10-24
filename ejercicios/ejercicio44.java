package ejercicios;

public class ejercicio44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CUANTAS PALABRAS HAY?
		String frase = "A ver cuantas parablas hay aqui";
		frase = frase.trim();
		int cont = 0;
		if(frase.length()>0) {
			for(int i =0; i<frase.length();i++)
				if(frase.charAt(i)==' ')
				{
					cont++;
				}
			System.out.println("Esta frase tiene " + (cont+1) + " palabras");
		}

	}

}
