package Secuenciales;

import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Pedimos al usuario que ingrese el radio
        double radio  = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio de la circunferencia:"));

        // Calculamos la longitud de la circunferencia
        double longitud = 2 * Math.PI * radio;

        // Mostramos la longitud de la circunferencia al usuario
        JOptionPane.showMessageDialog(null, "La longitud de la circunferencia es: " + longitud);
    }
}
