import javax.swing.*;

public class Ejercicio8 {

    /*8)	Pedir al usuario por pantalla dos números y analizar lo siguiente: Si ambos son números pares mostrar por pantalla "PARES",
     de lo contrario, si alguno de los dos números es impar, mostrar por pantalla "Uno de los dos números es impar".
     Tip de ayuda: usar operador Mod para saber si un número es par o impar…
     */
    public static void main(String[] args) {
        // Solicitamos al usuario que ingrese los dos números
        String numero1 = JOptionPane.showInputDialog(null, "Ingrese el primer número:");
        String numero2 = JOptionPane.showInputDialog(null, "Ingrese el segundo número:");

        // Convertimos los números ingresados a enteros
        int n1 = Integer.parseInt(numero1);
        int n2 = Integer.parseInt(numero2);

        // Verificamos si ambos números son pares o si al menos uno es impar
        if (n1 % 2 == 0 && n2 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "PARES");
        } else if (n1 % 2 == 0 || n2 % 2 == 0){
            JOptionPane.showMessageDialog(null, "Uno de los dos números es impar");
        }else{
            JOptionPane.showMessageDialog(null, "Ninguno es par");
        }
    }

}
