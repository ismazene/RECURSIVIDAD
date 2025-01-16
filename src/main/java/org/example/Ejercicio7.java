package org.example;

public class Ejercicio7 {

    public static void ejer7() {
        int num = Recursividad.pedirNumero("Dame un numero: ");
        int resultado = factorial_recursivo(num);
        System.out.println("La suma es: " + resultado);
    }
    public static int factorial_recursivo(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        }
        return numero + factorial_recursivo(numero - 1);
    }
}
