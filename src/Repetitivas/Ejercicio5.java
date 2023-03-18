package Repetitivas;

import java.util.Scanner;
/*
* Calcular el promedio de un alumno que tiene 7 calificaciones en la materia de Diseño Estructurado de Algoritmos
* */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        double calificacion, suma = 0, promedio;

        // Ciclo para solicitar las 7 calificaciones al usuario y acumular la suma
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese la calificación " + i + ": ");
            calificacion = sc.nextDouble();
            suma += calificacion;
        }

        // Cálculo del promedio
        promedio = suma / n;

        // Mostrar el resultado por consola
        System.out.println("El promedio del alumno es: " + promedio);
    }

}
