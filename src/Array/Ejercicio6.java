package Array;

import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {

        // Solicitar la cantidad de elementos del arreglo
        int cantidadElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos del arreglo:"));

        // Crear el arreglo A y llenarlo con números
        int[] A = new int[cantidadElementos];
        for (int i = 0; i < cantidadElementos; i++) {
            A[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número " + (i + 1) + " del arreglo A:"));
        }

        // Crear el arreglo B y copiar los números de A en orden inverso
        int[] B = new int[cantidadElementos];
        for (int i = cantidadElementos - 1; i >= 0; i--) {
            B[cantidadElementos - 1 - i] = A[i];
        }

        // Mostrar los arreglos A y B por pantalla
        JOptionPane.showMessageDialog(null, "Arreglo A: " + arrayToString(A));
        JOptionPane.showMessageDialog(null, "Arreglo B: " + arrayToString(B));
    }

    // Método auxiliar para convertir un arreglo en una cadena de caracteres
    public static String arrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            str += array[i];
            if (i < array.length - 1) {
                str += ",";
            }
        }
        str += "]";
        return str;
    }
}
