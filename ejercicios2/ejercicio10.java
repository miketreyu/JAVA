package ejercicios2;

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
         Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una empresa
         y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la información
         de N personas distintas (valor también introducido por teclado). Para cada persona, pedirá su
         género (0 para varón y 1 para mujer) y su sueldo. Esta información debe guardarse en una 
        */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el número de personas:");
        int N = sc.nextInt(); // Número de personas a registrar
        
        // Matriz para almacenar género y sueldo de cada persona
        // La primera columna será para el género (0 o 1), y la segunda para el sueldo.
        float[][] sueldos = new float[N][2];
        
        // Variables para la suma de sueldos
        float sumaHombres = 0, sumaMujeres = 0;
        int countHombres = 0, countMujeres = 0;
        
        // Pedir información para cada persona
        for (int i = 0; i < N; i++) {
            System.out.println("Introduce el género (0 para hombre, 1 para mujer) y el sueldo de la persona " + (i + 1) + ":");
            int genero = sc.nextInt();  // 0 = hombre, 1 = mujer
            float sueldo = sc.nextFloat();  // Sueldo de la persona
            
            sueldos[i][0] = genero;
            sueldos[i][1] = sueldo;
            
            // Acumular sueldos por género
            if (genero == 0) {
                sumaHombres += sueldo;
                countHombres++;
            } else {
                sumaMujeres += sueldo;
                countMujeres++;
            }
        }
        
        // Calcular el sueldo promedio de hombres y mujeres
        double promedioHombres = (countHombres > 0) ? sumaHombres / countHombres : 0;
        double promedioMujeres = (countMujeres > 0) ? sumaMujeres / countMujeres : 0;
        
        // Mostrar resultados
        System.out.println("\nPromedio de sueldos:");
        System.out.println("Promedio de sueldos de hombres: " + promedioHombres);
        System.out.println("Promedio de sueldos de mujeres: " + promedioMujeres);
        
        // Detectar brecha salarial
        if (promedioHombres > promedioMujeres) {
            System.out.println("Existe una brecha salarial: los hombres ganan más.");
        } else if (promedioHombres < promedioMujeres) {
            System.out.println("Existe una brecha salarial: las mujeres ganan más.");
        } else {
            System.out.println("No existe brecha salarial: los sueldos son iguales.");
        }
        
        // Mostrar la matriz de datos ingresados
        System.out.println("\nMatriz de datos (Género y Sueldo):");
        for (int i = 0; i < N; i++) {
            String generoStr = (sueldos[i][0] == 0) ? "Hombre" : "Mujer";
            System.out.println("Persona " + (i + 1) + " - Género: " + generoStr + ", Sueldo: " + sueldos[i][1]);
        }
        
        sc.close();
    }
}

