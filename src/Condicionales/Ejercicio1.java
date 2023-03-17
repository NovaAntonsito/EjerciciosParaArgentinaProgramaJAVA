package Condicionales;

import java.util.Scanner;
/*
Escriba un programa en PSeInt para convertir segundos a minutos, minutos a horas y horas a días.
 */
public class Ejercicio1 {
    public static void main(String[] args){
        //Variables y scanner
        Scanner sc = new Scanner(System.in);
        int secs;
        int days,mins, hours;
        //Leo la variable
        secs = sc.nextInt();
        sc.close();

        //Conversion a mins,horas y dias
        mins = secs / 60;
        hours = mins / 60;
        days = hours / 24;

        System.out.println("Los minutos son "+ mins);
        System.out.println("Las horas son "+ hours);
        System.out.println("Los dias "+ days);

    }
}
