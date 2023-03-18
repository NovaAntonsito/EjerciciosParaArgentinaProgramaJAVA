package Array;

import javax.swing.*;

public class Ejercicio9 {
    public static void main(String[] args) {

        char[] abecedario = new char[27]; // arreglo para guardar el abecedario
        int[] numeros = new int[10]; // arreglo para guardar los números
        String palabra = ""; // variable para guardar la palabra formada

        // llenar el arreglo del abecedario
        for (int i = 0; i < abecedario.length; i++) {
            abecedario[i] = JOptionPane.showInputDialog("Ingrese la letra #" + (i+1)).charAt(0);
        }

        // llenar el arreglo de números
        for (int i = 0; i < numeros.length; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número #" + (i+1)));
            // validar que el número esté entre 0 y la longitud del arreglo del abecedario
            while (num < 1 || num > abecedario.length) {
                num = Integer.parseInt(JOptionPane.showInputDialog("El número debe estar entre 1 y " + abecedario.length + ".\nIngrese el número #" + (i+1)));
            }

            numeros[i] = num;
        }

        // construir la palabra a partir de las letras del abecedario que corresponden a los números ingresados
        for (int i = 0; i < numeros.length; i++) {
            int index = numeros[i] - 1;
            palabra += abecedario[index];
        }

        // mostrar la palabra formada
        JOptionPane.showMessageDialog(null, "La palabra formada es: " + palabra);
    }
}
