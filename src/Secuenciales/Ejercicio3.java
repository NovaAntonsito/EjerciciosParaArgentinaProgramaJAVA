package Secuenciales;

import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {

        // Ingreso de los coeficientes a, b y c
        double a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el coeficiente a"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el coeficiente b"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el coeficiente c"));

        // Cálculo del discriminante
        double discriminante = Math.pow(b, 2) - 4 * a * c;

        // Comprobación de si hay soluciones reales
        if (discriminante >= 0) {

            // Cálculo de las dos soluciones
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            // Mostrar las soluciones por pantalla
            JOptionPane.showMessageDialog(null, "Las soluciones de la ecuación son: x1 = " + x1 + ", x2 = " + x2);

        } else {
            // Si no hay soluciones reales
            JOptionPane.showMessageDialog(null, "La ecuación no tiene soluciones reales");
        }
    }
}
