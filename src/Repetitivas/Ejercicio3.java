package Repetitivas;

import java.util.Scanner;

/*
Confeccionar un programa que permita calcular, mediante sumas sucesivas, el producto de dos valores ingresados.
*/
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer valor: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el segundo valor: ");
        int b = sc.nextInt();

        int producto = 0;

        for (int i = 0; i < b; i++) {
            producto += a;
        }

        System.out.println("El producto de " + a + " y " + b + " es: " + producto);
    }

}
