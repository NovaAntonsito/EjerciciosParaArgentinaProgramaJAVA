package EjerciciosClase2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Scanner y variables
        Scanner sc = new Scanner(System.in);
        int dado1, dado2, sumatoria;

        //Ingreso de datos
        System.out.println("Ingrese el primer dado");
        dado1 = sc.nextInt();
        System.out.println("Ingrese el segundo dado");
        dado2 = sc.nextInt();
        sumatoria = dado1 + dado2;
        sc.close();

        //Condicional que determina la suerte del usuario
        if(sumatoria >= 12){
            System.out.println("Excelente tiro!");
        } else if (sumatoria >= 7) {
            System.out.println("Buen tiro!");
        }else{
            System.out.println("Mala suerte ):");
        }
    }
}