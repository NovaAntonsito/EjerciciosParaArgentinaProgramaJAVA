package Array;

import javax.swing.*;

public class Ejercicio7 {
    public static void main(String[] args) {

        String[] nombres = new String[5]; // arreglo para guardar los nombres
        int[] edades = new int[5]; // arreglo para guardar las edades

        // llenar el arreglo de nombres
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = JOptionPane.showInputDialog("Ingrese el nombre #" + (i+1));
        }

        // llenar el arreglo de edades
        for (int i = 0; i < edades.length; i++) {
            edades[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de " + nombres[i]));
        }

        // mostrar la leyenda con los nombres y edades
        for (int i = 0; i < nombres.length; i++) {
            JOptionPane.showMessageDialog(null, nombres[i] + " tiene " + edades[i] + " años");
        }
    }
}
