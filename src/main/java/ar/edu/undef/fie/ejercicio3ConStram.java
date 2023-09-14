// 3. Hacer un programa que inicialice dos listas y muestre por pantalla la intersección entre las mismas.


package ar.edu.undef.fie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ejercicio3ConStram {
    public static void main (String[] args){

        Stream<Integer> streamDeNumeros0 = Stream.of(3, 5, 6);
        Stream<Integer> streamDeNumeros1 = Stream.of(7, 3, 6);

        List<Integer> lista0 = streamDeNumeros0.collect(Collectors.toList());
        List<Integer> lista1 = streamDeNumeros1.collect(Collectors.toList());

        System.out.println(lista0);
        System.out.println(lista1);


        List<Integer> interseccion = new ArrayList<>(lista0);
        interseccion.retainAll(lista1);

        System.out.println("Intersección: " + interseccion);

    }
}
