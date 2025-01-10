package org.example;

import java.util.Scanner;

public class Ejercicio1 {
    public static void ejer1(){
        int num = Recursividad.pedirNumero();
        System.out.println(digitos(num));

    }
    public static int digitos(int num) {

        if (num < 10) {
            return 1;
        }
        return 1 + digitos(num/10);
    }

}
