import javax.swing.*;

public class Ejercicio1 {

    public static void main(String[] args) {
        /*1)Realizar un programa que pida dos números por pantalla, si el primer número es mayor (>) al segundo,
         restar el segundo número al primero y mostrar el resultado por pantalla. Caso contrario, restar el primer número al segundo
          y mostrar resultado por pantalla.
         */
        //Ingreso de variables y parseo
        int numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero",null));
        int numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero",null));

        //Condicional
        if(numero1>numero2){
            JOptionPane.showMessageDialog(null,"El resultado es: "+(numero1-numero2));
        }else{
            JOptionPane.showMessageDialog(null,"El resultado es: "+(numero2-numero1));

        }

    }
}
