package Secuenciales;

import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Pedir al usuario que ingrese los segundos
        int segundos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de segundos:"));

        // Convertir a minutos
        double minutos = segundos / 60;

        // Convertir a horas
        double horas = minutos / 60;

        // Convertir a días
        double dias = horas / 24;

        // Mostrar resultados
        JOptionPane.showMessageDialog(null, "Minutos: " + minutos);
        JOptionPane.showMessageDialog(null, "Horas: " + horas);
        JOptionPane.showMessageDialog(null, "Días: " + dias);
    }
}
