package org.example;

public class Ejercicio5 {

    public static void ejer5() {
        int num = Recursividad.pedirNumero();

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

