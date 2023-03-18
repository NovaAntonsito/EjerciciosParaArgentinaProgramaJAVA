package Array;

import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {

        // Crear los arreglos A y B
        int[] A = {2, 4, 1, 6};
        int[] B = {3, 8, 12, 0};

        // Crear el arreglo C para almacenar la suma de los elementos de A y B
        int[] C = new int[A.length];

        // Sumar los elementos de los arreglos A y B y guardar el resultado en el arreglo C
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }

        // Mostrar los arreglos A, B y C por pantalla
        JOptionPane.showMessageDialog(null, "Arreglo A: " + arrayToString(A));
        JOptionPane.showMessageDialog(null, "Arreglo B: " + arrayToString(B));
        JOptionPane.showMessageDialog(null, "Arreglo C: " + arrayToString(C));
    }

    // Método auxiliar para convertir un arreglo en una cadena de caracteres
    public static String arrayToString(int[] array) {
        String arrayEnString = "[";
        for (int i = 0; i < array.length; i++) {
            arrayEnString += array[i];
            if (i < array.length - 1) {
                arrayEnString += ",";
            }
        }
        arrayEnString += "]";
        return arrayEnString;
    }
}
