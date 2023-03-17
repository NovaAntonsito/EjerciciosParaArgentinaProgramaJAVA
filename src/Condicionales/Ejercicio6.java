package Condicionales;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        double PI = 3.1416; // Valor de PI
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el radio de la circunferencia: ");
        double radio = sc.nextDouble();

        double longitud = 2 * PI * radio;

        System.out.println("La longitud de la circunferencia de radio " + radio + " es " + longitud);
    }
}
