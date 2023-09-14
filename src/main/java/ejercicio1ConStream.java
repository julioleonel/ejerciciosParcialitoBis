/*1. Hacer un programa que calcule el promedio de los números pasados por argumento
 a través de la consola, y lo muestre por la pantalla.
*/

import java.util.Arrays;

public class ejercicio1ConStream {
    public static void main (String[]args){

        System.out.print("Argumentos pasados: " );

        for (String argumento : args){
            System.out.print(argumento + " ");
        }
        System.out.println(" ");

        // Convertir los argumentos de cadena a números enteros y almacenarlos en un arreglo
        int[] numeros = Arrays.stream(args)//convierte el arreglo de cadenas args en un stream de cadenas.
                .mapToInt(Integer::parseInt) // convierte cada cadena en un número
                .toArray(); // convierte el stream de números en un arreglo de enteros numeros.

        double promedio = Arrays.stream(numeros)
                .average() // calcula el promedio
                .orElse(0.0); // proporcionar un valor predeterminado


        System.out.println("Promedio: " + promedio);
    }
}
