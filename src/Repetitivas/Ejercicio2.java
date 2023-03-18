package Repetitivas;
/*
* 2. Realice un programa que cuente y muestre la cantidad de números pares comprendidos entre 6 y 72 inclusive.
 */
public class Ejercicio2 {
    public static void main(String[] args){
        for (int i = 0; i < 100; i++) {
            if(i >= 6 && i <= 72 && i % 2 == 0){
                System.out.println("El numero "+i+" es par");
            }
        }
    }
}
