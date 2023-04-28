/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_nahimhilsaca;

import java.util.Scanner;

/**
 *
 * @author nahim
 */
public class Lab2P1_NahimHilsaca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion=1;
        while (opcion != 4) {
        System.out.println("Menu");
        System.out.println("1.Clasificando numeros");
        System.out.println("2.Aproximando PI");
        System.out.println("3.MCD");
        System.out.println("4.Salir");
        opcion = leer.nextInt();
            switch (opcion) {

                case 1: {
                    System.out.println("Ingrese el numero que desea evaluar");
                    int num = leer.nextInt();

                    boolean valor = true;
                    boolean division = true;
                    int cont0 = 0;
                    int contrepetido = 1;

                    while (num <= 0) {
                        System.out.println("Su numero tiene que ser mayor a 0");
                        num = leer.nextInt();
                    }

                    if ((num % 2 == 0)) {
                        valor = true;
                        System.out.print("Su numero es par");
                    } else {
                        valor = false;
                        System.out.print("Su numero es impar");

                    }

                    while (contrepetido <= num) {

                        if (num % contrepetido == 0) {

                            cont0++;

                        }
                        contrepetido++;

                    }

                    if (cont0 == 2) {
                        division = true;
                        System.out.print(" y es primo");
                    } else {
                        division = false;
                        System.out.print(" y no es primo");
                    }
                    System.out.println("");
                }// Fin del case 1
                break;

                case 2: {

                    System.out.println(" Ingrese la precision del calculo");
                    int num = leer.nextInt();
                    int i = 1;
                    double divi = 1;
                    double producto = 1;

                    while (num < 0) {
                        System.out.println("Su numero tiene que ser mayor a 0");
                        num = leer.nextInt();
                    }

                    while (i <= num) {
                        double potencia = Math.pow(i, 2);
                        potencia *= 4;
                        double resta = potencia - 1;
                        divi = potencia / resta;
                        producto *= divi;
                        i++;

                    }
                    producto *= 2;

                    System.out.println("PI:" + producto);

                }// Fin del case 2
                break;

                case 3: {

                    System.out.println("Ingrese A");
                    int A = leer.nextInt();
                    System.out.println("Ingrese B");
                    int B = leer.nextInt();

                    while ((A <= 0) || (B <= 0)) {
                        System.out.println("Los numeros ingresados deben ser positivos y no ser 0");
                        System.out.println("Ingrese A");
                        A = leer.nextInt();
                        System.out.println("Ingrese B");
                        B = leer.nextInt();
                    }

                    while (A != B) {

                        if (A > B) {
                            A = A - B;

                        } else {
                            B = B - A;
                        }

                    }

                    System.out.println(" El MCD de sus numeros es: " + A);

                }// Fin del case 3
                break;

                default:
                    System.out.println("Opcion incorrecta. Eliga entre el 1 al 3");
                    break;
            }// Fin del switch

            System.out.println("Desea continuar? Presione 4 si no lo desea");
            opcion = leer.nextInt();

        }// Fin del while

    }// Fin del main

}// Fin de la clase
