package org.example;
import java.util.Scanner;

public class Recursividad {
    static Scanner teclado = new Scanner(System.in);

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
        System.out.println("");
        System.out.println("Elige una opcion");
        System.out.println("[M] - Volver al menú principal");
        System.out.println("[X] - SALIR");

        String OpcionFinalMayusculas = guardarOpcionFinal();

        switch (OpcionFinalMayusculas) {
            case "M":
                imprimirMenu();
                break;
            case "X":
                System.exit(0);
        }
    }

    public static String guardarOpcionFinal() {
        String opcionfinal = teclado.next();
        String OpcionFinalMayusculas = opcionfinal.toUpperCase();
        return OpcionFinalMayusculas;
    }

    public static int seleccionarEjer() {
        int numCase = teclado.nextInt();
        return numCase;
    }

    public static void main(String[] args) {
        while (true) {
            imprimirMenu();
            int numCase = seleccionarEjer();
            switch (numCase) {
                case 1:
                    Ejercicio1.ejer1();
                    menuFinal();
                    break;
                case 2:
                    Ejercicio2.ejer2();
                    menuFinal();
                    break;
                case 3:
                    menuEjer3();
                    menuFinal();
                    break;
                case 4:
                Ejercicio4.ejer4();
                menuFinal();
                     break;
                case 5:
                    Ejercicio5.ejer5();
                    menuFinal();
                    break;
                case 6:
                    Ejercicio6.ejer6();
                    menuFinal();
                    break;
//                case 7:
//                    menuEjer3();
//                    menuFinal();
//                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    public static int pedirNumero() {
        System.out.println("");
        System.out.println("Dame un numero");
        return teclado.nextInt();
    }

    public static int pedirNumero2() {
        System.out.println("");
        System.out.println("Dame el segundo numero");
        return teclado.nextInt();
    }

    public static void menuEjer3() {
        System.out.println("");
        System.out.println("Que opcion prefieres???");
        System.out.println("1.- Invertir numeros");
        System.out.println("2.- Invertir cadenas");
        seleccionarEjer3();
    }

    public static int pedirNumEjer3() {
        int numEjer3 = teclado.nextInt();
        return numEjer3;
    }

    public static void seleccionarEjer3() {

        int numEjer3 = pedirNumEjer3();
        switch (numEjer3) {
            case 1:
                Ejercicio3.ejer3();
                menuFinal();
                break;
            case 2:
                Ejercicio3_1.ejer3_1();
                menuFinal();
                break;
            default:
                System.out.println("Opción no válida");
        }
    }

}