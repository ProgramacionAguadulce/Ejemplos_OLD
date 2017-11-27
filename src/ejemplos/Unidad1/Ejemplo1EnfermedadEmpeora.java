package ejemplos.Unidad1;


import java.util.Scanner;

/**
 * Unidad 1 / Ejercicio 1 : ¿Está empeorando el enfermo?.
 * 
 * Enunciado: La enfermedad empeora cuando se tiene frío 
 * y la temperatura es mayor de 37, o se suda y la temperatura 
 * es menor de 39. 
 * 
 * Realiza un ejercicio que ayude a determinar si el empleado ha empeorado o no,
 * para ello primero se tendrán que pedir los datos, y después, mostrar 
 * el resultado sin emplear estructuras if.
 * 
 */
public class Ejemplo1EnfermedadEmpeora {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        double temperaturaDelPaciente;
        boolean frio;
        String frioStr;
        
        // Leemos si tiene frio o no
        System.out.println("¿Tiene usted frio? (Si/No) ");
        frioStr = sc.next();
        frio=frioStr.equalsIgnoreCase("SI");
        
        // Leemos la temperatura que tiene
        System.out.println("que temperatura tiene?");
        temperaturaDelPaciente = sc.nextDouble();
        
        //Leemos si suda
        System.out.println("¿Está sudando? (Si/No) ");
        String sudaStr = sc.next();
        boolean suda=sudaStr.equalsIgnoreCase("SI");
        
        // Mostramos si la enfermedad ha emperado o no... ¿cómo?
        boolean enfermedadEmpeora=(frio && temperaturaDelPaciente>37)
        || (suda && temperaturaDelPaciente<39);
     
        String enfermedadEmpeoraStr=
        
                /* expresión lógica o variable boolean a evaluar */
                enfermedadEmpeora 
            
                ? 
                /* Si la expresión lógica anterior es true, el valor devuelto
                por esta expresión será el siguiente*/
                "Si, está peor" 
                
                : 
                /* Si la expresión lógica anterior es FALSE, el valor devuelto
                por esta expresión será el siguiente*/
                "No, está mejor";
                
    
        
        System.out.print("Ha emperado el paciente: ");
        System.out.println(enfermedadEmpeoraStr);
    }
}
