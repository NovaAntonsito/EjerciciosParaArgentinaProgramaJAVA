package Array;

import javax.swing.*;

public class Ejercicio10 {

    public static void main(String[] args) {
        double[] notas = new double[5];
        String[] nombres = new String[5];

        // ingreso de datos por parte del usuario
        for (int i = 0; i < notas.length; i++) {
            nombres[i] = JOptionPane.showInputDialog(null, "Ingrese el nombre del alumno " + (i+1));
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota del alumno " + nombres[i]));
        }

        // mostrar la calificación en palabras
        for (int i = 0; i < notas.length; i++) {
            String resultado = obtenerCalificacion(notas[i]);
            JOptionPane.showMessageDialog(null, nombres[i] + " tiene una nota de " + notas[i] + " y su calificación es " + resultado);
        }
    }

    // método para obtener la calificación en palabras
    public static String obtenerCalificacion(double nota) {
        String resultado = "";
        if (nota >= 0 && nota < 5) {
            resultado = "Suspenso";
        } else if (nota >= 5 && nota < 7) {
            resultado = "Bien";
        } else if (nota >= 7 && nota < 9) {
            resultado = "Notable";
        } else if (nota >= 9 && nota <= 10) {
            resultado = "Sobresaliente";
        }
        return resultado;
    }
}
