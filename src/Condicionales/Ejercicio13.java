// Importamos la clase JOptionPane para poder utilizar sus métodos
import javax.swing.JOptionPane;

public class Ejercicio13 {

    public static void main(String[] args) {
        // Pedimos al usuario que ingrese un número y lo almacenamos en la variable "numero"
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número:"));

        // Inicializamos la variable "resultado" como una cadena vacía
        String resultado = "";

        // Evaluamos si el número es negativo utilizando una instrucción "if"
        if (numero < 0) {
            resultado = "negativo"; // Si es negativo, asignamos el valor "negativo" a la variable "resultado"
        } else if (numero == 0) {
            resultado = "igual a 0"; // Si es igual a 0, asignamos el valor "igual a 0" a la variable "resultado"
        } else {
            resultado = "positivo"; // Si es positivo, asignamos el valor "positivo" a la variable "resultado"
        }

        // Utilizamos JOptionPane para mostrar el resultado
        JOptionPane.showMessageDialog(null, "El número es " + resultado);
    }
}
