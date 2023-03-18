package Secuenciales;

import javax.swing.*;

public class Ejercicio7 {
    public static void main(String[] args) {

        // Solicitar temperatura en grados Fahrenheit
        double fahrenheit= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en grados Fahrenheit:"));


        // Realizar la conversión de Fahrenheit a Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Mostrar el resultado en un JOptionPane
        JOptionPane.showMessageDialog(null, "La temperatura en grados Celsius es: " + celsius);
    }
}
