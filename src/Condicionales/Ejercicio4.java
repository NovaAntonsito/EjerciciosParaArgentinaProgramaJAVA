package Condicionales;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        //Variables y inicializo
        Scanner sc = new Scanner(System.in);
        int numeroEnInteger = sc.nextInt();
        //Convierto el Integer a String
        String numeroATexto = Integer.toString(numeroEnInteger);

        //Paso muestro los datos
        System.out.println("El numero "+ numeroEnInteger+ " es Integer y a texto seria "+ numeroATexto);
    }
}
