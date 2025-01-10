package org.example;

public class Ejercicio3 {
    public static void ejer3() {

    }

    public static void delReves(int num) {
        //Asi es como se hace el ejercicio, obviamente en casa tengo que hacer el resto en casa.      
        if (num < 10) {
            System.out.println(num);
        } else {
            System.out.println(num % 10);
            delReves(num / 10);
        }
    }
}
