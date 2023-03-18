package Repetitivas;

import java.util.Scanner;

/*
* .Calcular e imprimir la tabla de multiplicar de un número cualquiera.
* Imprimir el multiplicando, el multiplicador y el producto.
 * */
public class Ejercicio11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número del cual desea la tabla de multiplicar: ");
        int num = sc.nextInt();

        System.out.println("Tabla de multiplicar del " + num + ":");
        for (int i = 1; i <= 10; i++) {
            int producto = num * i;
            System.out.println(num + " x " + i + " = " + producto);
        }
    }
}
