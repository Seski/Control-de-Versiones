package practica1;

import java.util.Scanner;

/**
 *
 * @author 1DAM
 */
public class Marcos {
     public static void llenarArray(int array[]){
        
        int numero = numero();
        
        array[4]= numero/10000;
        numero = numero%10000;
        
        array[3]= numero/1000;
        numero = numero%1000;
        
        array[2]= numero/100;
        numero = numero%100;
        
        array[1]= numero/10;
        
        array[0]= numero%10;
    }
    
    public static int numero(){
        int numero;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.print("Introduzca un número de 5 cifras: ");
            numero = entrada.nextInt();
        }while(numero<10000 | numero>99999);    
        return numero;
    }
    
    public static void mostrarArray(int array[]){
        
        System.out.print("El nuevo orden es: ");
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        
        System.out.println("");
    }
    
    public static void main(String[] args) {
        
        int array[] = new int[5];
        
        llenarArray(array);
        mostrarArray(array);        
    }
}