package org.example;

public class Ejercicio1 {
    public static void ejer1() {
            int num = Recursividad.pedirNumero("Dame un numero: ");
            System.out.println(digitos(num));
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
