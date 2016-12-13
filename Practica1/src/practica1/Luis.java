
package practica1;

import java.util.Scanner;

/**
 *
 * @author Luis Gonzalez Duran
 */
public class Luis {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado;
        double area;
        double perimetro;
        double raiz;
        
        System.out.print("Por favor, introduzca la medida de un lado ");
        lado = entrada.nextDouble();
        
        raiz=Math.sqrt (3);
        
        area = (raiz/4) * (lado * lado) ;//raiz de 3 divido por 4 por el lado al cuadrado
        perimetro = lado * 3;
        System.out.println("El area del triangulo de lado: " +lado + " es: " +area); 
        System.out.println("El perimetro de un triangulo de lado: " + lado +" es: " +perimetro);
        
        System.out.println("marcos estuvo aqui");
        
        System.out.println("Soy Alejandro");
        
        System.out.println("Ismael de Si estuvo aquí.");
    }

}
