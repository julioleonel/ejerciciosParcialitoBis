/*
2. Hacer un programa que defina una lista de números enteros, y tenga una función booleana que recibe una lista y un número entero.
 La función deberá devolver verdadero si el elemento pasado por parámetro existe.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ejercicio2ConStream {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(4);
        listaNumeros.add(5);

        int numeroBuscado = 3;

        boolean existe = buscarNumero(listaNumeros, numeroBuscado);

        if (existe) {
            System.out.println("El número " + numeroBuscado + " existe en la lista.");
        } else {
            System.out.println("El número " + numeroBuscado + " no existe en la lista.");
        }
    }

    public static boolean buscarNumero(List<Integer> lista, int numero) {
        return lista.stream()
                .anyMatch(elemento -> elemento == numero);
    }
}
