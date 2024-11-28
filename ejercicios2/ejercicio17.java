package ejercicios2;

public class ejercicio17 {

    public static void main(String[] args) {
        // DEFINE UN ARRAY DE NUMEROS ENTEROS DE 3 FILAS POR 6 COLUMNAS 
        // CON NOMBRE NUM Y ASIGNA LOS VALORES SEGÚN LA SIGUIENTE TABLA
        
        int [][]num = {
            {0, 30, 2, 0, 0, 7},
            {75, 0, 0, 0, 0, 0},
            {0, 0, -2, 9, 0, 11}
        };
        
        // Imprimir la cabecera de las columnas
        System.out.printf("%6s", " ");
        for (int columna = 0; columna < 6; columna++) {
            System.out.printf("%10s", "Columna " + columna);
        }
        System.out.println();

        // Recorrer y imprimir los valores del array
        for (int fila = 0; fila < num.length; fila++) {
            System.out.printf("Fila %d", fila);
            for (int columna = 0; columna < num[fila].length; columna++) {
                System.out.printf("%10d", num[fila][columna]);
            }
            System.out.println(); // Nueva línea para la siguiente fila
        }
    }
}

