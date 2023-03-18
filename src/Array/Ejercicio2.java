package Array;

import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {

        // Pedir al usuario que ingrese el tamaño del arreglo
        int tamanoDelArreglo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño del arreglo"));

        // Crear el arreglo para almacenar los n números enteros
        int[] numeros = new int[tamanoDelArreglo];

        // Leer los números ingresados por el usuario
        for (int i = 0; i < tamanoDelArreglo; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número #" + (i+1)));
        }

        // Crear un nuevo arreglo para almacenar los números al cuadrado
        int[] cuadrados = new int[tamanoDelArreglo];

        // Calcular los cuadrados y guardarlos en el nuevo arreglo
        for (int i = 0; i < tamanoDelArreglo; i++) {
            cuadrados[i] = numeros[i] * numeros[i];
        }

        // Mostrar los números y sus cuadrados por pantalla
        String mensaje = "Los números ingresados son: ";
        for (int i = 0; i < tamanoDelArreglo; i++) {
            mensaje += numeros[i] + ", ";
        }
        mensaje += "\nSus cuadrados son: ";
        for (int i = 0; i < tamanoDelArreglo; i++) {
            mensaje += cuadrados[i] + ", ";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
