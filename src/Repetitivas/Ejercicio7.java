package Repetitivas;
/*
Leer 10 números e imprimir solamente los números positivos
* */
public class Ejercicio7 {
    public static void main(String[] args){
        int cantidadNumeros = 10;

        System.out.println("Números positivos:");
        for (int i = 0; i < cantidadNumeros; i++) {
            double numero = Math.random() * 20 - 10; // Generar número aleatorio entre -10 y 10
            if (numero >= 0) {
                System.out.println(numero);
            }
        }
    }
}
