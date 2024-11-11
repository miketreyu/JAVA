package examen1EV;
import java.util.*;


public class Ex_MiguelEgea {

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
				char alfabeto[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
				String contrasenan=sc.next().toUpperCase();
				char c[]=contrasenan.toCharArray(); 
				
				;
				break;
			case 3: texto = "Miercoles";
				break;
			case 4: 
				int[]intentosf= new int[]{2, 3, 6, 4, 3, 1, 3};
				String[]nombres={"Hermione","Harry","Draco","Ron","Luna","Sirius","Dobby"};
				int suma = 0;
				int media = 0;
				int contad = 0;
				int cont7=0, cont8=0, cont9=0;
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
		            if(intentosf[k]<=3) {
		            	cont7++;
		            }
		        }
				for (int l = 0; l < intentosf.length; l++) {
		            if(intentosf[l]<=3&&intentosf[l]>=5) {
		            	cont8++;
		            }
		        }
				for (int m = 0; m < intentosf.length; m++) {
		            if(intentosf[m]<6) {
		            	cont9++;
		            }
		        }
				System.out.println("Los nombres y numeros van seguidos en orden: ");
				System.out.println(Arrays.toString(nombres));
				System.out.println(Arrays.toString(intentosf));
				System.out.println("El total de intentos fallidos es: "+suma );
				System.out.println("La media es : " + media);
				System.out.println("El total de personas que superan la media es: " + contad );
				System.out.println("El total de personas que tienen 3 o menos intentos fallidos es: " + cont7);
				System.out.println("El total de personas que tienen entre 3 y 5 intentos fallidos es: " + cont8);
				System.out.println("El total de personas que tienen 6 o mmas intentos fallidos es: " + cont9);
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
