package Repetitivas;

import java.util.Scanner;

/*
 * Elabore un programa que calcule el factorial de un número, hasta que se ingrese un valor negativo.
 * */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        // Ciclo do-while para solicitar al usuario que ingrese un número hasta que se ingrese un valor negativo
        do {
            System.out.print("Ingrese un número (ingrese un valor negativo para salir): ");
            num = sc.nextInt();

            // Si el número ingresado es mayor o igual a 0, se calcula el factorial y se muestra el resultado
            if (num >= 0) {
                int factorial = 1;
                // Ciclo for para calcular el factorial del número
                for (int i = 2; i <= num; i++) {
                    factorial *= i;
                }
                System.out.println("El factorial de " + num + " es: " + factorial);
            }

        } while (num >= 0);
    }
}
