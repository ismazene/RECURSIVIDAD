package org.example;

public class Ejercicio1 {
    public static void ejer1() {

        try {
            int num = Recursividad.pedirNumero();
            System.out.println(digitos(num));
        } catch (Exception e) {
            System.err.println("Error. Introduce una opcion validada");
        }
    }
    public static int digitos(int num) {
        if (num == 0) {
            return 0;
        } else if (num < 10) {
            return 1;
        }
        return 1 + digitos(num / 10);
    }



}
