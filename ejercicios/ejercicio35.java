package ejercicios;

public class ejercicio35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase ="Mi frase";
		char letras[]={'L','A','U','R','A'};
		String nombre1=new String (letras);
		//String nombre2="Ana";
		String nombre2="laura";
		
		//boolean iguales=nombre1.equals(nombre2);
		boolean iguales=nombre1.equalsIgnoreCase(nombre2);
		
		if (iguales)
			System.out.println("son inguales");
		else
			System.out.println("no son inguales");
		nombre2="Andres";
		iguales=nombre1.equals(nombre2);
		
		
		if (iguales)
			System.out.println("son inguales");
		else
			System.out.println("no son inguales");
		
		int compara=nombre1.compareTo(nombre2);
		System.out.println(compara);
		compara=nombre2.compareTo(nombre1);
		System.out.println(compara);
		nombre2="Laura";
		compara=nombre2.compareTo(nombre1);
		System.out.println(compara);
		
		String numeros= String.valueOf(compara);
		System.out.println(numeros);
		//int suma=numeros;
		System.out.println(frase.length());
		System.out.println(nombre1+nombre2);
		System.out.println(nombre1+" " +nombre2);
		System.out.println(nombre1.concat(nombre2));
		//proponer que con concat ponga el espacio en blanco
		//System.out.println(nombre1.concat(" ".concat(nombre2)));
		
		char letra0=nombre1.charAt(0);	
		System.out.println(letra0);
		char letra1=nombre1.charAt(1);	
		System.out.println(letra1);
		
		System.out.println(frase.substring(1));
		System.out.println(frase.substring(1,4)); //Del 1 al 3
		System.out.println(nombre2.indexOf('a')); 
		System.out.println(nombre2.lastIndexOf('a'));
		System.out.println(nombre2.startsWith("Ma"));
		System.out.println(nombre2.endsWith("ria"));
		
		System.out.println(nombre2.replace('a', 'e'));
		System.out.println(nombre2);
		//no cambia el valor en la cadena, para ello habría que asignarlo a si mismo
		nombre2=nombre2.replace('a', 'e');
		System.out.println(nombre2);
		//no cambia el valor en la cadena, para ello habría que asignarlo a otro
		String nombre3=nombre1.replace('a', 'e');
		System.out.println(nombre3);
		System.out.println(nombre3.toLowerCase());
		System.out.println(nombre3); //no lo cambia, sólo para impresión, asignarlo si se quiere cambiar 
		System.out.println(nombre3.toUpperCase());
		char[] arraychar=nombre3.toCharArray();
		System.out.println(arraychar[2]);
		  
		
		String sf1=String.format("Hola %s :",nombre1);
		float numero=32.33432f;
		String sf2=String.format("La cantidad  %f de su salario ",numero);  
		String sf3=String.format("La cantidad  %.2f de su salario",numero);  
		
		System.out.println(sf1);  
		System.out.println(sf2);  
		System.out.println(sf3);  
		
		System.out.println(nombre1);
		System.out.println(nombre1.matches("a")); //que sólo tenga una a
		System.out.println(nombre1.matches(".*[jq].*")); // que tenga j o k con que tenga 1 ok
		System.out.println(nombre1.matches(".*[aei].*")); // que tenga i o r o e con que tenga 1 ok
		System.out.println(nombre1.matches(".*[^u].*")); // que no tenga u
		System.out.println(nombre1.matches("[a-z].*")); // que empieze por una letra minúscula
		System.out.println(nombre1.matches("[A-Z].*")); // que empieze por una letra minúscula
		
		System.out.println("ABC".matches("[A-Z][a-z]+.*")); // que empiece por letra mayúscula y le sigan minusculas una o más veces
		System.out.println("Abc".matches("[A-Z][a-z]+[1-9].*")); // que empieze por una letra mayúsucula, le sigan una o varias minúsculas, y le siga un número
		System.out.println("Abc1".matches("[A-Z][a-z]+[1-9].*")); // que empieze por una letra mayúsucula, le sigan una o varias minúsculas, y le siga un número
		System.out.println("Abc1B".matches("[A-Z][a-z]+[1-9][A-Z]+")); // que empieze por una letra mayúsucula, le sigan una o varias minúsculas, y le siga un número al que le tiene que seguir una o varias mayúsculas

	}

}
