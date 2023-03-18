package Repetitivas;

import java.util.Scanner;

/*
* Suponga que se tiene un conjunto de calificaciones de un grupo de 10 alumnos.
*  Realizar un algoritmo para calcular la calificación media y la calificación más baja de todo el grupo.
* */
public class Ejercicio10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Inicializamos las variables que vamos a utilizar
        int calificacion, suma = 0;
        int minima = 100; // inicializamos la variable minima con un valor mayor a cualquier calificación posible

        // Le pedimos al usuario que ingrese las calificaciones de los 10 alumnos
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingresa la calificación del alumno " + i + ": ");
            calificacion = sc.nextInt();

            // Sumamos la calificación a la suma total
            suma += calificacion;

            // Si la calificación es menor que la calificación mínima actual, la actualizamos
            if (calificacion < minima) {
                minima = calificacion;
            }
        }

        // Calculamos el promedio dividiendo la suma total entre el número de alumnos
        double promedio = (double) suma / 10;

        // Imprimimos los resultados
        System.out.println("La calificación media del grupo es: " + promedio);
        System.out.println("La calificación más baja del grupo es: " + minima);

        // Cerramos el objeto Scanner
        sc.close();
    }
}
