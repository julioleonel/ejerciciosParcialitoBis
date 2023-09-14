/*
2. Hacer un programa que defina una lista de números enteros, y tenga una función booleana que recibe una lista y un número entero.
 La función deberá devolver verdadero si el elemento pasado por parámetro existe.
 */

import java.util.ArrayList;
import java.util.List;


public class ejercicio2{
    public static void main(String[] args) {

        for (String argumento : args) {

            System.out.println("Argumento pasado: " + argumento + " ");
        }

        int numero = Integer.parseInt(args[0]);

        List<Integer> numeros = new ArrayList<>();
        numeros.add(4);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        System.out.print("Numeros de la lista: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        if(existeNumero(numeros, numero)){
            System.out.println(numero + " existe en la lista.");
        } else {
            System.out.println(numero + " no existe en la lista.");
        }
    }



    public static boolean existeNumero(List<Integer> lista, int valor){
            for(int elemento : lista){
                if (elemento == valor){
                    return true;
                }
            }
            return false;
        }

    }

