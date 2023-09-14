// 3. Hacer un programa que inicialice dos listas y muestre por pantalla la intersección entre las mismas.

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    public static void main (String []args){

        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();

        lista1.add(10);
        lista1.add(20);
        lista1.add(30);
        lista2.add(30);
        lista2.add(50);
        lista2.add(80);

        System.out.print("Elementos de la lista 1: ");
        for (int elemento : lista1){
            System.out.print(elemento + " ");
        }

        System.out.println(" ");

        System.out.print("Elementos de la lista 2: ");
        for (int elemento : lista2){
            System.out.print(elemento + " ");
        }

        System.out.println(" ");
        System.out.print("Interseccion: ");
        for (int numero1 : lista1){
            for (int numero2 : lista2){
                if (numero1 == numero2){
                    System.out.println(numero1);
                }
            }
        }
    }
}
