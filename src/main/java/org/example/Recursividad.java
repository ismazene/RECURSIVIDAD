package org.example;

import java.util.Scanner;

public class Recursividad {

    public static void imprimirMenu() {

        System.out.println("***Bateria de ejercicios sobre recursividad***");
        System.out.println("Selecciona a continuación el modo que quieras ejecutar...");

        System.out.println("1- Digitos");
        System.out.println("2- Potencias");
        System.out.println("3- Del reves");
        System.out.println("4- Binario");
        System.out.println("5- A Binario");
        System.out.println("6- Orden alfabetico");
        System.out.println("7- Mostrar suma");

    }

    public static void menuFinal() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("");
        System.out.println("Elige una opcion");
        System.out.println("[M] - Volver al menú principal");
        System.out.println("[X] - SALIR");
        String opcionfinal = teclado.next();
        String OpcionFinalMayusculas = opcionfinal.toUpperCase();


        switch (OpcionFinalMayusculas) {
            case "M":
                System.out.flush();
                imprimirMenu();
                break;
            case "X":
                System.exit(0);
        }
    }

    public static int seleccionarEjer() {
        Scanner teclado = new Scanner(System.in);
        int numCase = teclado.nextInt();
        return numCase;
    }

    public static void main(String[] args) {
        imprimirMenu();
        int numCase = seleccionarEjer();
        while (true) {

            switch (numCase) {
                case 1:
                    Ejercicio1.ejer1();
                    menuFinal();
                case 2:
                    Ejercicio2.ejer2();
                    menuFinal();
                    break;
                default:
                    System.out.println("Opción no valida");
            }

        }
    }

    public static int pedirNumero(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame un numero");
        return teclado.nextInt();
    }
}

