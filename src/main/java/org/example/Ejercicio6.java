package org.example;

public class Ejercicio6 {
    static char[] palabra_vector;

    public static void ejer6() {
        String palabra = "papo";
        palabra_vector = palabra.toCharArray();

        if (estaOrdenado(0)) {
            System.out.println("La palabra " + palabra + " esta ordenada");
        } else {
            System.out.println("La palabra " + palabra + " no esta ordenada");
        }
    }
    public static boolean estaOrdenado(int posicion) {
        if (posicion < palabra_vector.length - 1) {
            if (palabra_vector[posicion] <= palabra_vector[posicion + 1]) {
                // Recursivamente verificamos la siguiente posición
                return estaOrdenado(posicion + 1);
            } else {
                return false;
            }
        }
        return true;
    }


}