package ar.edu.undef.fie;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticaStream {
    public static void main (String[] args){
        Stream<String> streamDeStrings = Stream.of("Antonio", "Maria", "Juan", "Pedro") // una forma de declarar
                .filter(s -> s.contains("a"))
                .map(s -> s.toUpperCase());

         List<String> lista = streamDeStrings.collect(Collectors.toList()); // conviete a lista
         System.out.println(lista);



        List<String> lista1 = Arrays.asList("Antonia", "Maria", "Juan", "Pedro"); // la mas usada
        Stream<String> streamDeLista1 = lista1.stream();

        //imprime cantidad de elementos
        long streamDeStrings1 = Stream.of("Antonio", "Maria", "Juan", "Pedro") // una forma de declarar
                .count();
        System.out.println(streamDeStrings1);

        //imprime cantidad de elementos
        boolean streamDeStrings2 = Stream.of("Antonio", "Maria", "Juan", "Pedro") // una forma de declarar
                .anyMatch(s -> s.contains("M"));
        System.out.println(streamDeStrings2);


    }
}
