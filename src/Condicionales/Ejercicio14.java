import javax.swing.*;

public class Ejercicio14 {
/*14)	Desarrolle un algoritmo que a partir de dos números ingresados se realicen los siguiente cálculos según las siguientes condiciones.
Si el primer número es un número positivo deberá mostrarse por pantalla la suma de los cuadrados de ambos números.
Si el primer número es un número negativo deberá mostrarse por pantalla el primero elevado por el segundo.
 Todos los números deben ser enteros. Operador potencia -> ^ (alt + 94)
*/
    public static void main(String[] args) {
        // Solicitamos los dos números al usuario mediante JOptionPane
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));

        // Realizamos los cálculos según las condiciones dadas
        if (num1 > 0) {
            int resultado = num1 * num1 + num2 * num2;
            JOptionPane.showMessageDialog(null, "La suma de los cuadrados es: " + resultado);
        } else {
            int resultado = (int) Math.pow(num1, num2);
            JOptionPane.showMessageDialog(null, "El primer número elevado al segundo es: " + resultado);
        }
    }
}
