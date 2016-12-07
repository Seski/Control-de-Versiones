/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author IsmA
 */
public class Ismael {

    public static int aleatorio() {

        double decimal;
        int entero;

        decimal = (Math.random() * 100) + 100;
        decimal = Math.floor(decimal);
        entero = (int) decimal;

        return entero;
    }

    public static void rellenar(int vector[][]) {

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 3; j++) {
                vector[i][j] = aleatorio();

            }
        }

    }

    public static void mostrar(int vector[][]) {

        int numero;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 3; j++) {

                numero = vector[i][j];

                if (numero % 2 == 0) {
                    System.out.println("La posición " + i + j + " tendrá el valor " + vector[i][j]);
                }
            }
        }

    }

    public static void main(String[] args) {

        System.out.println("Rellenar con aleatorios un Array 4x3 e imprimir los pares. \n");

        int[][] vector = new int[4][3];
        rellenar(vector);
        mostrar(vector);
    }

}



