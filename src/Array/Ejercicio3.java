package Array;

import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {

        // Pedir al usuario que ingrese la cantidad de productos
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de productos"));

        // Crear los arreglos para almacenar los precios y cantidades de productos
        double[] precios = new double[n];
        int[] cantidades = new int[n];

        // Leer los precios y cantidades de productos ingresados por el usuario
        for (int i = 0; i < n; i++) {
            precios[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio del producto #" + (i+1)));
            cantidades[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad del producto #" + (i+1)));
        }

        // Calcular el costo total del plato
        double costoTotal = 0;
        for (int i = 0; i < n; i++) {
            costoTotal += precios[i] * cantidades[i];
        }

        // Mostrar el costo total del plato por pantalla
        JOptionPane.showMessageDialog(null, "El costo total del plato es: $" + costoTotal);
    }
}
