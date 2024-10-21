package ejercicios;

import java.util.Scanner;
public class ejercicio32 {

    public static void main(String[] args) {
        int n1, n2, suma, resta, multiplicacion, division;
        Scanner sc = new Scanner(System.in);
        String opcion=" ";

        do {

            System.out.println("¿Qué quieres hacer? ");
            System.out.println("+. Sumar");
            System.out.println("-. Restar");
            System.out.println("*. Multiplicar");
            System.out.println("/. Dividir");
            System.out.println("?. Salir");
            System.out.print("Introduce opcion: ");
            opcion = sc.nextLine();

            switch (opcion) {
                case "+": // Sumar 
                    System.out.println("--Suma de dos enteros--");
                    System.out.print("Introduce un numero: ");
                    n1 = sc.nextInt();
                    System.out.print("Introduce otro numero: ");
                    n2 = sc.nextInt();
                    sc.nextLine();

                    suma = n1 + n2;

                    System.out.println("La suma es: " + suma);
                    break;
                    
                case "-": // Restar
                    System.out.println("--Resta de dos enteros--");
                    System.out.print("Introduce un numero: ");
                    n1 = sc.nextInt();
                    System.out.print("Introduce otro numero: ");
                    n2 = sc.nextInt();
                    sc.nextLine();

                    resta = n1 - n2;

                    System.out.println("La resta es: " + resta);
                    break;
                    
                case "*": // Multiplicar
                    System.out.println("--Multiplicación de dos enteros--");
                    System.out.print("Introduce un numero: ");
                    n1 = sc.nextInt();
                    System.out.print("Introduce otro numero: ");
                    n2 = sc.nextInt();
                    sc.nextLine();

                    multiplicacion = n1 * n2;

                    System.out.println("La multiplicación es: " + multiplicacion);
                    break;
                    
                case "/": // Dividir
                    System.out.println("--División de dos enteros--");
                    System.out.print("Introduce un numero: ");
                    n1 = sc.nextInt();
                    System.out.print("Introduce otro numero: ");
                    n2 = sc.nextInt();
                    sc.nextLine();

                    if (n2 != 0) {
                        division = n1 / n2;
                        System.out.println("La división es: " + division);
                    } else {
                        System.out.println("Error: División entre 0.");
                    }
                    break;
                    
                case "?": // Salir
                    System.out.println("Adios!");
                    break;
                default: // En otro caso
                    System.out.println("Error: opción incorrecta.");
            }

        } while (!opcion.equals("?"));
    }

}