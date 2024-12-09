package ejercicios2;

public class ejercicio31 {

    // Método para generar un array de enteros con valores aleatorios entre 0 y 100
    public static int[] generaArrayInt(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 101); // Números aleatorios entre 0 y 100
        }
        return array;
    }

    // Método para encontrar el valor mínimo en un array de enteros
    public static int minimoArrayInt(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; // Actualiza el mínimo si encuentra un valor menor
            }
        }
        return min;
    }

    // Método para encontrar el valor máximo en un array de enteros
    public static int maximoArrayInt(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Actualiza el máximo si encuentra un valor mayor
            }
        }
        return max;
    }

    // Método para comprobar si un número está presente en el array
    public static boolean estaEnArrayInt(int n, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                System.out.println("Está en el array");
                return true; // El número se encuentra en el array
            }
        }
        return false; // El número no se encuentra en el array
    }

    // Método para encontrar la posición de un número en el array
    public static int posicionEnArrayInt(int n, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return i; // Devuelve la posición si encuentra el número
            }
        }
        return -1; // Retorna -1 si el número no está en el array
    }

    public static void main(String[] args) {
        // Crear un arreglo con 10 números aleatorios
        int[] array = generaArrayInt(10);

        // Imprimir el arreglo generado
        System.out.println("Array generado: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Llamar al método para encontrar el valor mínimo
        int minimo = minimoArrayInt(array);
        System.out.println("El valor mínimo del array es: " + minimo);

        // Llamar al método para encontrar el valor máximo
        int maximo = maximoArrayInt(array);
        System.out.println("El valor máximo del array es: " + maximo);

        // Comprobar si el número 50 está en el array
        estaEnArrayInt(50, array);

        // Encontrar la posición de un número (por ejemplo, 50) en el array
        int posicion = posicionEnArrayInt(50, array);
        if (posicion != -1) {
            System.out.println("El número 50 se encuentra en la posición: " + posicion);
        } else {
            System.out.println("El número 50 no está en el array");
        }
    }
}


