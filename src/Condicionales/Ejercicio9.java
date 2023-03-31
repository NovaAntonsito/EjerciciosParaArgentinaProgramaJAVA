import javax.swing.*;

public class Ejercicio9 {
    /*9)	Pedir 3 números por pantalla al usuario. Devolver un mensaje que incluya la suma de los 3 números y
    también un mensaje que diga si dicho resultado contiene 3 o más cifras, caso contrario, mostrar el resultado y "contiene menos de 3 cifras".
Ejemplo: Resultado de la suma: 102, contiene 3 o más cifras. Ejemplo 2: Resultado de la suma: 45, contiene menos de 3 cifras.
Hacer lo mismo para la multiplicación de los 3 números, pero en vez de devolver si la cantidad de cifras es mayor a 3 o no,
 devolver si el resultado es múltiplo de 2.
Ejemplo: Resultado de la multiplicación: 1892, es múltiplo de 2. Ejemplo 2: Resultado de la multiplicación: 103, no es múltiplo de 2.
*/
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer número:"));

        // Suma de los tres números
        int suma = num1 + num2 + num3;
        String mensajeSuma = "Resultado de la suma: " + suma;
        if (String.valueOf(suma).length() >= 3) {
            mensajeSuma += ", contiene 3 o más cifras.";
        } else {
            mensajeSuma += ", contiene menos de 3 cifras.";
        }
        JOptionPane.showMessageDialog(null, mensajeSuma);

        // Multiplicación de los tres números
        int multiplicacion = num1 * num2 * num3;
        String mensajeMultiplicacion = "Resultado de la multiplicación: " + multiplicacion;
        if (multiplicacion % 2 == 0) {
            mensajeMultiplicacion += ", es múltiplo de 2.";
        } else {
            mensajeMultiplicacion += ", no es múltiplo de 2.";
        }
        JOptionPane.showMessageDialog(null, mensajeMultiplicacion);
    }
}
