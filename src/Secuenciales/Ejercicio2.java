package Secuenciales;

import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Pedir al usuario que ingrese la información del empleado
        int identificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de identificación del empleado:"));
        double salarioPorHora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario por hora del empleado:"));
        double horasTrabajadas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número de horas trabajadas en el mes:"));

        // Calcular el salario bruto del empleado
        double salarioBruto = salarioPorHora * horasTrabajadas;

        // Mostrar el salario bruto del empleado
        JOptionPane.showMessageDialog(null, "El salario del empleado con identificación " + identificacion + " es $" + salarioBruto + " por mes.");
    }
}
