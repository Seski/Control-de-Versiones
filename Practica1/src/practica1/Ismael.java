/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author IsmA
 */
public class Ismael {
    public static int pedirLongitud(){
    
        int longitud = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        do {            
            
            System.out.print("Introduce una longitud: ");
            
            try {
                
                longitud = entrada.nextInt();
                
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Por favor, introduce números enteros.");
            }
            
            if((longitud > 10) || (longitud < 1)){
            
                System.out.println("La longitud debe ser de 1 a 10.");
            }
            
            
        } while ((longitud > 10) || (longitud < 1));
        
    
        
        return longitud;
    }

    
    public static void rellenar(int vector[]){
        
     double numeroPre;
     int numero;
     
        for (int i = 0; i < vector.length ; i++) {
            
            numeroPre = (Math.random() * 6) + 1;
            numeroPre = Math.floor(numeroPre);
            numero = (int) numeroPre;
            vector[i] = numero;
        }   
    }
    
    public static void mostrar(int vector[]){
    
        for (int i = 0; i < vector.length; i++) {
            
            System.out.println("La posición " + i + " corresponde con el valor " + vector[i]);
            
            
        }
    
    }
    public static void main(String[] args) {
        
        System.out.println("¿Rellenar un array de números aleatorios?");
        
        int [] vector = new int [pedirLongitud()];        
        rellenar(vector);
        mostrar(vector);
        
    }
}
