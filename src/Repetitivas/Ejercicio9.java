package Repetitivas;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingresa un número negativo: ");
            num = sc.nextInt();
            while (num >= 0) {
                System.out.print("El número ingresado no es negativo. Ingresa un número negativo: ");
                num = sc.nextInt();
            }
            num = -num; // Convierte el número negativo en su equivalente positivo
            System.out.println("El número " + num + " convertido a positivo es: " + num);
        }
        sc.close();
    }
}
