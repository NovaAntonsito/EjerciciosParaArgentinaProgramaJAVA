package Secuenciales;

import javax.swing.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Pedimos la cantidad de billetes de cada denominación
        int billetes500 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de billetes de $500: "));
        int billetes100 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de billetes de $100: "));
        int billetes50 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de billetes de $50: "));
        int billetes10 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de billetes de $10: "));

        // Calculamos el total de dinero
        int total = (billetes500 * 500) + (billetes100 * 100) + (billetes50 * 50) + (billetes10 * 10);

        // Mostramos el resultado
        JOptionPane.showMessageDialog(null, "El total de dinero que tiene es: $" + total);
    }
}
