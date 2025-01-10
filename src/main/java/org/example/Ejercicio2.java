package org.example;

public class Ejercicio2 {
    public static void ejer2(){
        int base = 3;
        int exponente = 3;
        //Esto hay que ponerlo como para que el usuario sea el qu eelija los numero que va a utilizar
        //seguramente tenga que hacer llamadas a otros metodos o crearlo de tal manera que sea ese metodo quien pregunta cual es el numero

    }
    public static int potencia(int base, int exponente) {
        if (exponente==0){
            return 1;
        }
        return base*potencia(base,--exponente);
    }

}

