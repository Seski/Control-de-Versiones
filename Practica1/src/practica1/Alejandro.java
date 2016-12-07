package practica1;

import java.util.Scanner;

/**
 * @author Alejandro Bajo Perez
 */
public class Alejandro {

    public static void rellenarVector(int[] vector) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, rellene el siguiente vector de 10 posiciones:");
        for (int i = 0; i < 10; i++) {

            System.out.println("Introduce un valor para la posición " + i + ":");
            vector[i] = entrada.nextInt();
        }
    }

    public static void paresVector(int[] vector) {

        for (int i = 0; i < 10; i++) {

            if (vector[i] % 2 == 0) {

                System.out.println("El valor guardado en la posición " + i + " es par y es: " + vector[i]);

            }
        }

    }

    public static void main(String[] args) {

        int[] vector = new int[10];
        rellenarVector(vector);
        paresVector(vector);

    }

}
