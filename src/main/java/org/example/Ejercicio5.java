package org.example;

public class Ejercicio5 {
    public static void ejer5() {
        int num = Recursividad.pedirNumero("Dame un numero y lo convierto a binario: ");
        String binario = aBinario(num);

        System.out.println("El número " + num + " en binario es: " + binario);
    }
    public static String aBinario(int numero){
        if(numero==0 || numero==1){
            return Integer.toString(numero);
        }else{
            return aBinario(numero/2)+numero%2;
        }
    }
}
