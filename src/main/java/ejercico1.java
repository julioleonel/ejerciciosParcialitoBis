/*1. Hacer un programa que calcule el promedio de los números pasados por argumento
 a través de la consola, y lo muestre por la pantalla.
*/

public class ejercico1{
    public static void main(String[] args) {

        System.out.print("Argumentos pasados: " );

        for (String argumento : args){
            System.out.print(argumento + " ");
        }
        System.out.println(" ");
        int cantidad = args.length;
        int suma = 0;

        for (String argumento : args){
            int numero = Integer.parseInt(argumento);
            suma += numero;
        }

        float promedio = (float) suma / cantidad;
        System.out.println("El promedio es: " + promedio);


    }
}
