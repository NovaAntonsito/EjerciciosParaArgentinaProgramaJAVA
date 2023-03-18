package Repetitivas;
/*
* Leer 10 números e imprimir cuantos son  positivos, cuantos negativos y cuantos neutros.
* */


public class Ejercicio8 {
    public static void main(String[] args){
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        double number;

        for (int i = 1; i <= 10; i++) {
            // Generar un número aleatorio entre -10 y 10
            number = Math.random() * 20 - 10;
            System.out.println("Número " + i + ": " + number);

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Cantidad de números positivos: " + positiveCount);
        System.out.println("Cantidad de números negativos: " + negativeCount);
        System.out.println("Cantidad de números neutros: " + zeroCount);
    }
}
