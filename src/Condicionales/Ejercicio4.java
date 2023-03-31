import javax.swing.*;

public class Ejercicio4 {

    public static void main(String[] args) {
        /*4)	Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables
        numero1, numero2, numero3 respectivamente. El algoritmo debe imprimir cuál es el mayor.
         */
        double numero1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero",null));
        double numero2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero",null));
        double numero3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer numero",null));
        //Condicional, busco el mas grande
        /*Lo que hace es establecer el primer número como el mayor inicialmente, y luego comparar los otros dos con él.
         Si cualquiera de los otros dos es mayor, se establece como el nuevo valor de mayor.*/
        double mayor = numero1;
        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor) {
            mayor = numero3;
        }
        JOptionPane.showMessageDialog(null,"El mayor es: "+mayor);
    }
}
