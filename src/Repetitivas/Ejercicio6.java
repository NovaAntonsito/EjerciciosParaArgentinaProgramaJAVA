package Repetitivas;

import java.util.Scanner;

/*
* Leer 10 números y obtener su cubo y su cuarta.
* */
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num, cubo, cuarta;

        // Ciclo para solicitar al usuario que ingrese los 10 números y calcular sus cubos y cuartas
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            num = sc.nextDouble();
            cubo = Math.pow(num, 3);
            cuarta = Math.pow(num, 4);
            System.out.println("El cubo de " + num + " es: " + cubo);
            System.out.println("La cuarta de " + num + " es: " + cuarta);
        }
    }
}
