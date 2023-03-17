
package Condicionales;

// Importamos la clase JOptionPane para poder utilizar sus métodos
import javax.swing.JOptionPane;

public class Ejercicio12 {
/*12)	Una reconocida empresa de la ciudad necesita de sus servicios como programador, necesitan un sistema que calcule el sueldo de los empleados,
 el cual es 20000 para aquellos empleados que llevan hasta 3 meses(inclusive), y luego de los 3 meses, el doble.
 El sistema requiere ingresar nombre y apellido del empleado y tiempo de antigüedad en meses, muestre su sueldo según corresponda.*/
    public static void main(String[] args) {
        // Pedimos al usuario que ingrese el nombre del empleado y lo almacenamos en la variable "nombre"
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");

        // Pedimos al usuario que ingrese el apellido del empleado y lo almacenamos en la variable "apellido"
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del empleado:");

        // Pedimos al usuario que ingrese la antigüedad en meses del empleado y lo almacenamos en la variable "antiguedad"
        int antiguedad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la antigüedad del empleado en meses:"));

        // Inicializamos la variable "sueldo" en 0
        double sueldo = 0;

        // Evaluamos la antigüedad del empleado utilizando una instrucción "if"
        if (antiguedad <= 3) {
            // Si la antigüedad es menor o igual a 3 meses, el sueldo es de $20,000
            sueldo = 20000;
        } else {
            // Si la antigüedad es mayor a 3 meses, el sueldo es de $40,000
            sueldo = 40000;
        }

        // Utilizamos JOptionPane para mostrar el sueldo del empleado
        JOptionPane.showMessageDialog(null, "El sueldo de " + nombre + " " + apellido + " es $" + sueldo);
    }
}

