package Condicionales;

import javax.swing.*;

public class Ejercicio11 {
    /*11)	Hacer un algoritmo que a partir de dos números ingresados se imprima un resultado según las siguientes condiciones.
Si el primero es mayor que el segundo, se mostrará la división entre primero / segundo.
Si el segundo es mayor que el primero, se solicitará ingresar un tercer número, mostrando por consola la suma de los 3.
Recordemos que no se puede dividir por 0. Te invito a realizar la validación correspondiente
para evitar que nuestro programa lance un error si el segundo número es igual a 0
*/
    public static void main(String[] args) {
        // Pedimos al usuario que ingrese el primer número y lo almacenamos en la variable "num1"
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));
        // Pedimos al usuario que ingrese el segundo número y lo almacenamos en la variable "num2"
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));

        // Evaluamos si el segundo número es igual a 0 utilizando una instrucción "if"
        if (num2 == 0) {
            JOptionPane.showMessageDialog(null, "El segundo número no puede ser cero.");
        } else if (num1 > num2) { // Si el primer número es mayor que el segundo
            double resultado = num1 / num2; // Dividimos el primer número por el segundo y almacenamos el resultado en la variable "resultado"
            JOptionPane.showMessageDialog(null, "El resultado de la división es: " + resultado); // Mostramos el resultado utilizando JOptionPane
        } else if (num2 > num1) { // Si el segundo número es mayor que el primero
            // Pedimos al usuario que ingrese el tercer número y lo almacenamos en la variable "num3"
            double num3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer número:"));
            double resultado = num1 + num2 + num3; // Sumamos los tres números y almacenamos el resultado en la variable "resultado"
            JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + resultado); // Mostramos el resultado utilizando JOptionPane
        } else { // Si los números ingresados son iguales
            JOptionPane.showMessageDialog(null, "Los números ingresados son iguales.");
        }
    }
}







