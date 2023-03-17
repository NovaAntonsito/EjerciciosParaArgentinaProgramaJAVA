package Condicionales;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        //Creo las millas staticas
        double MILLAS_POR_KILOMETRO = 1.609;
        Scanner sc = new Scanner(System.in);
        //Leo las variables
        System.out.print("Introduce la cantidad de millas a convertir: ");
        double millas = sc.nextDouble();

        //Conversion a kilometros
        double kilometros = millas * MILLAS_POR_KILOMETRO;

        System.out.println(millas + " millas equivalen a " + kilometros + " kilómetros.");
    }
}
