package examen1EV;
import java.util.*;

public class b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		String texto;
		Scanner sc = new Scanner (System.in);
		System.out.println("Bienvenido al sistema de la ANC");
		System.out.println("Selecciona una opción: ");
		System.out.println("1. Iniciar sesión ");
		System.out.println("2. Cifrar un mensaje (Cifrado Cesar) ");
		System.out.println("3. Generar una Contraseña Segura ");
		System.out.println("4. Informe de actividades sospechosas ");
		System.out.println("5. Salir ");
		opcion = sc.nextInt();
		switch(opcion) {
			case 1:
				System.out.println("Introduzca la contraseña");
				String contrasena = "D6a1M24";
				String contrasena2 = sc.next();
				int cont=3;
				if(contrasena2.equals(contrasena)) 
				{
					System.out.println("Contraseña correcta!");
				}
				else 
				{
					System.out.println("Contraseña incorrecta");
					cont--;
					System.out.println("Te quedan " + cont + " intentos");
					String contrasena3 = sc.next();
					if(contrasena3.equals(contrasena)) 
					{
						System.out.println("Contraseña correcta!");
					}
					else 
					{
						System.out.println("Contraseña incorrecta");
						cont--;
						System.out.println("Te quedan " + cont + " intentos");
						String contrasena4 = sc.next();
						if(contrasena4.equals(contrasena)) 
						{
							System.out.println("Contraseña correcta!");
						}
						else
						{
							System.out.println("Numero maximo de intentos permitidos alcanzado");
						}
						
					}
				}
				break;
			case 2:
				String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String textoCodificado = "";
				System.out.println("Introduce el texto a encriptar:");
				String text = sc.nextLine();
				System.out.println("Introduce la clave");
				int desplazamiento = sc.nextInt();
				text = text.toUpperCase();
				char caracter;
				
				for(int i = 0; i < text.length(); i++)
				{
					caracter = text.charAt(i);
					int pos = alfabeto.indexOf(caracter);
					if(pos==-1)
					{
						
					}
				}
				
				;
				break;
			case 3:// Generar contraseña segura
				String contrasenha="";
				System.out.println("Introduce la longitud de la contraseña (8-20)");
				int longitud = sc.nextInt();
				sc.nextLine();
				if (longitud < 8 || longitud > 20)
				{
					System.out.println("Longitud incorrecta");
					break;
				}
				String mayusMinus = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnoprstuvwxyz";
				String numeros = "1234567890";
				String especiales = "@#$%&!";
				int letramayus = (int)Math.random()*mayusMinus.length();
				int numero = (int)Math.random()*numeros.length();
				int especial = (int)Math.random()*especiales.length();
				contrasenha = ""+mayusMinus.charAt(letramayus)+numeros.charAt(numero)+especiales.charAt(especial);
				contrasenha = contrasenha.toUpperCase(); 
				String todos=mayusMinus+numeros+especiales;
				for(int i = 3; i<todos.length();i++)
				{
					int pos =(int)(Math.random()*todos.length());
					contrasenha += todos.charAt(pos);
				}
				System.out.println("Contraseña generada " + contrasenha);
				System.out.println();
				System.out.println();
				break;
			case 4: 
				int[]intentosf= new int[]{2, 3, 6, 4, 3, 1, 3};
				String[]nombres={"Hermione","Harry","Draco","Ron","Luna","Sirius","Dobby"};
				int suma = 0;
				int media = 0;
				int contad = 0;
				int normal=0, sospe=0, muysospe=0;
				for (int i = 0; i < intentosf.length; i++) {
		            suma += intentosf[i];
		        }
				media = suma/intentosf.length;
				for (int j = 0; j < intentosf.length; j++) {
		            if(intentosf[j]<media) {
		            	contad++;
		            }
		        }
				for (int k = 0; k < intentosf.length; k++) {
		            int intento = intentosf[k];
					if(intento<=3) {
		            	normal++;
		            }
					else if(intento<5) {
						sospe++;
					}
					else {
						muysospe++;
					}
		        }
				for (int l = 0; l < intentosf.length; l++) {
		           
		        }
				for (int m = 0; m < intentosf.length; m++) {
		       
		            }
		        }
				System.out.println("Los nombres y numeros van seguidos en orden: ");
				System.out.println(Arrays.toString(nombres));
				System.out.println(Arrays.toString(intentosf));
				System.out.println("El total de intentos fallidos es: "+suma );
				System.out.println("La media es : " + media);
				System.out.println("El total de personas que superan la media es: " + contad );
				System.out.println("El total de personas que tienen 3 o menos intentos fallidos es: " );
				System.out.println("El total de personas que tienen entre 3 y 5 intentos fallidos es: " );
				System.out.println("El total de personas que tienen 6 o mmas intentos fallidos es: " );
				;
				break;
			case 5:;
				break;
			default: texto = "La opción es incorrecta";
				break;
				
		} 
		System.out.println("Hasta pronto");
		sc.close();
		


	}

}
