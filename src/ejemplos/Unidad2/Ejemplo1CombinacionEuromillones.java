package ejemplos.Unidad2;


import java.util.Random;

/**
 * Unidad 2 / Ejercicio 1 - Combinación Euromillones
 * Enunciado: Utilizando la estructura "do-while" elegir 5 números al azar entre
 * 1 y 50 y dos números entre 1 y 12. Dichos números tienen que ser diferentes
 * entre sí.
 *
 * @author Salvador Romero Villegas
 * 
 */
public class Ejemplo1CombinacionEuromillones {
    public static void main(String args[]) {
        // Para hacer este ejercicio necesitamos generar un número aleatorio.
        int numero1, numero2, numero3, numero4, numero5;
        int estrella1, estrella2;
        Random miGenerador=new Random();
        final int MAX1=50;
        final int MAX2=12;
        numero1=miGenerador.nextInt(MAX1)+1; // Generamos un número entre 1 y MAX1
        do {
             numero2=miGenerador.nextInt(MAX1)+1; // Generamos un número entre 1 y MAX1
        } while (numero1==numero2);
        
        do {
           numero3=miGenerador.nextInt(MAX1)+1; // Generamos un número entre 1 y MAX1
        } while (numero1==numero3 || numero2==numero3);
        
        do {
           numero4=miGenerador.nextInt(MAX1)+1; // Generamos un número entre 1 y MAX1
        } while (numero1==numero4 || numero2==numero4 || numero3==numero4 );
        
        do {
           numero5=miGenerador.nextInt(MAX1)+1; // Generamos un número entre 1 y MAX1
        } while (numero1==numero5 || numero2==numero5 || numero3==numero5 ||
            numero4==numero5);
        
        estrella1=miGenerador.nextInt(MAX2)+1;
        do {
            estrella2=miGenerador.nextInt(MAX2)+1;
        } while (estrella1 == estrella2);
        
        System.out.println("El primer número generado es:" + numero1);
        System.out.println("El segundo número generado es:" + numero2);
        System.out.println("El tercer número generado es:" + numero3);
        System.out.println("El cuarto número generado es:" + numero4);
        System.out.println("El quinto número generado es:" + numero5);
        System.out.println("La estrella 1 es:" + estrella1);
        System.out.println("La estrella 2 es:" + estrella2);
                
    }
}
