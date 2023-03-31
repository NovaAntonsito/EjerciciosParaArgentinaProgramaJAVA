import javax.swing.*;

public class Ejercicio15 {
/*15)	Escribir un programa que lea dos números enteros desde el teclado y si el primero es mayor que el segundo intercambie sus valores.
 Nota: Si alguno de los dos valores ingresados por el usuario fue negativo, primero transformar en positivo antes de intercambiarlo.*/
    public static void main(String[] args) {

        // Pedimos al usuario que ingrese dos numeros enteros mediante JOptionPane y los almacenamos en dos variables de tipo int
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número entero:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número entero:"));

        // Verificamos si alguno de los numeros es negativo y si es asi, los convertimos en positivos
        if (num1 < 0) {
            num1 = -num1;
        }
        if (num2 < 0) {
            num2 = -num2;
        }
        // Verificamos si el primer numero es mayor que el segundo, y si es asi, intercambiamos sus valores utilizando una variable auxiliar
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        // Mostramos por pantalla los valores de los numeros luego de haber sido intercambiados si correspondia
        JOptionPane.showMessageDialog(null, "El primer número es: " + num1 + "\nEl segundo número es: " + num2);
    }
}
