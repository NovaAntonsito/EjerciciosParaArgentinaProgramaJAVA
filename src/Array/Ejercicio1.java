package Array;

import javax.swing.*;

public class Ejercicio1 {

    public static void main(String[] args) {
        // Crear el arreglo para almacenar los 5 números enteros
        int[] numeros = new int[5];

        // Leer los números ingresados por el usuario
        for (int i = 0; i < 5; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número #" + (i+1)));
        }

        // Mostrar los números ingresados por pantalla
        JOptionPane.showMessageDialog(null, "Los números ingresados son: " +
                numeros[0] + ", " +
                numeros[1] + ", " +
                numeros[2] + ", " +
                numeros[3] + ", " +
                numeros[4]);
    }


}
