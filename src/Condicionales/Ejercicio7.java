package Condicionales;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la temperatura en grados Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit + " grados Fahrenheit son " + celsius + " grados Celsius.");
    }
}
