package org.example;

public class Ejercicio2 {
    public static void ejer2() {
        int base = Recursividad.pedirNumero("Dame la base:");
        int exponente = Recursividad.pedirNumero("Dame el exponente:");

        if (base <= 0 || exponente <= 0) {
            System.out.println("Los dos numeros deben de ser positivos");
        } else {
            System.out.println("El resultado es: " + potencia(base, exponente));
        }
    }
    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base*potencia(base,--exponente);
    }
}




