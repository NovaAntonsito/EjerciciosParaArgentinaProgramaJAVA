package EjerciciosClase2;

import java.util.Scanner;

/*
Introducir 10 números y mostrar por consola cuantos números son positivos, cuantos números son negativos
y cuantas veces se introdujo solo el numero 0 (es decir un número que no es positivo ni negativo)
 */
public class Ejercicio3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num,countNegativo = 0,countPositivos = 0,countCero = 0;

        System.out.println("Ingrese 10 numeros");
        for (int i = 0; i <= 10; i++) {
            num = sc.nextInt();
            if(num > 0){
                countPositivos++;
            }else if (num < 0){
                System.out.println();
                countNegativo++;
            }else{
                countCero++;
            }

        }
        sc.close();

        System.out.println("Hubieron "+countPositivos+ " positivos");
        System.out.println("Hubieron "+countNegativo+ " Negativos");
        System.out.println("Hubieron "+countCero+ " Ceros");

    }
}
