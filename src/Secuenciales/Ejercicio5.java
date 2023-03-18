package Secuenciales;

import javax.swing.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Leer la cantidad de millas ingresada por el usuario

        double millas  = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de millas:"));

        // Convertir millas a kilómetros
        double kilometros = millas * 1.609;

        // Mostrar resultado en kilómetros
        JOptionPane.showMessageDialog(null, millas + " millas equivalen a " + kilometros + " kilómetros.");
    }
}
