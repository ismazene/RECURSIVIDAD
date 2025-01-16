package org.example;

public class Ejercicio4 {

    public static void ejer4() {
        int num = Recursividad.pedirNumero("Dame un numero y te digo si es binario o no: ");

        boolean esBinario = esBinario(num);

        if (esBinario) {
            System.out.println("El número " + num + " es binario.");
        } else {
            System.out.println("El número " + num + " no es binario.");
        }
    }
    public static boolean esBinario(int num) {
        if (num > 9) {
            if (num % 10 == 0 || num % 10 == 1) {
                return esBinario(num / 10);
            } else {
                return false;
            }
        }

        if (num == 0 || num == 1) {
            return true;
        } else {
            return false;
        }
    }
}

