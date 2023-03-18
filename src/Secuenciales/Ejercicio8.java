package Secuenciales;

import javax.swing.*;

public class Ejercicio8 {
    public static void main(String[] args) {

        //Solicito los numeros a los que les quiero calcular la distancia
        double num1= Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer número:"));
        double num2  =Double.parseDouble( JOptionPane.showInputDialog("Introduce el segundo número:"));

        //Utilizo la funcion abs de Math para calcular el valor absoluto de la diferencia entre num1 y num2
        double distancia = Math.abs(num1 - num2);

        JOptionPane.showMessageDialog(null, "La distancia entre " + num1 + " y " + num2 + " es " + distancia);
    }
}
