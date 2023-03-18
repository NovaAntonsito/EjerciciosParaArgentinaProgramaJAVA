package Secuenciales;

import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Ingreso el numero como cadena
        String cadena = JOptionPane.showInputDialog(null, "Ingrese un número entero:");
        //Parseo la cadena para obtener el numero
        int numero = Integer.parseInt(cadena);
        //Muestro el resultado
        JOptionPane.showMessageDialog(null, "El número ingresado es: " + numero);
    }
}
