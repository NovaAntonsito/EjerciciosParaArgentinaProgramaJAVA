import javax.swing.*;

public class Ejercicio5 {
    /*5)	Desarrolle un algoritmo que permita identificar que tan bueno fueron los números resultantes de dos dados al ser lanzados. Considerando:
Si la suma de ambos es igual a 12 mostrar por pantalla "Excelente Tiro"
Si la suma de ambos es igual o mayor a 7 y menor a 12 mostrar por pantalla "Buen Tiro" Si la suma de ambos es menor a 7 mostrar por pantalla "Mala Suerte!"
RETO EXTRA: Te animamos a validar también que ambos números ingresados sean correctos, es decir entre 1 y 6 (incluidos)
*/
    public static void main(String[] args) {

        int dado1, dado2, suma;

        // Pedimos al usuario que ingrese los números de los dados
        System.out.println("Ingrese el número del primer dado (entre 1 y 6): ");
        dado1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del primer dado (entre 1 y 6)",null));
        dado2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del segundo dado (entre 1 y 6)",null));

        // Validamos que el número ingresado esté dentro del rango correcto
        if (dado1 < 1 || dado1 > 6) {
            System.out.println("Número ingresado incorrecto.");
            return; // Salimos del programa si el número es incorrecto
        }
        // Validamos que el número ingresado esté dentro del rango correcto
        if (dado2 < 1 || dado2 > 6) {
            System.out.println("Número ingresado incorrecto.");
            return; // Salimos del programa si el número es incorrecto
        }

        // Calculamos la suma de los números de los dados
        suma = dado1 + dado2;

        // Evaluamos los resultados y mostramos el mensaje correspondiente
        if (suma == 12) {
            JOptionPane.showMessageDialog(null,"Excelente Tiro");
        } else if (suma >= 7 && suma < 12) {
            JOptionPane.showMessageDialog(null,"Buen Tiro");
        } else {
            JOptionPane.showMessageDialog(null,"Mala Suerte!");
        }
    }

}
