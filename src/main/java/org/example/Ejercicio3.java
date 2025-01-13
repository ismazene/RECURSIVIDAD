package org.example;

public class Ejercicio3 {
    public static void ejer3() {
        int num = Recursividad.pedirNumero();
        System.out.println(delReves(num));

    }
    public static int delReves(int num) {
        if (num < 10) {
            System.out.println(num);
        } else {
            System.out.println(num % 10);
            delReves(num / 10);
        }
        return 0;
    }
}
