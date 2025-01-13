package org.example;
import java.util.Scanner;

public class Ejercicio3_1 {

    public static void ejer3_1(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime la palabra que quieres que se muestre del reves");
        String palabra = teclado.next();

        char[] palabra_vector = palabra.toCharArray();

        del_reves_texto(palabra_vector.length - 1, palabra_vector);
    }

    public static void del_reves_texto(int posicion, char[] palabra_vector){
        if (posicion >= 0){
            System.out.print(palabra_vector[posicion]);
            del_reves_texto(posicion - 1, palabra_vector);
        }
    }
}
