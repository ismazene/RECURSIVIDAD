package org.example;
import java.util.Scanner;

public class Ejercicio3_1 {
    static char[]palabra_vector;

    public static void ejer3_1(){
        String palabra = Recursividad.pedirCadena();
        palabra_vector = palabra.toCharArray();

        del_reves_texto(palabra_vector.length - 1, palabra_vector);
    }
    public static void del_reves_texto(int posicion, char[] palabra_vector){
        if (posicion >= 0){
            System.out.print(palabra_vector[posicion]);
            del_reves_texto(posicion - 1, palabra_vector);
        }
    }
}
