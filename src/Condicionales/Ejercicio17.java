package Condicionales;
import javax.swing.*;

public class Ejercicio17 {
   //17)	Escribir un programa que lea un carácter e indique si es o no una vocal.
   public static void main(String[] args) {
       // Pedimos al usuario que ingrese un carácter
       char letra = JOptionPane.showInputDialog("Ingrese un carácter:").toLowerCase().charAt(0);

       // Creamos la variable para guardar el resultado
       String resultado;

       // Evaluamos la letra con un switch
       switch (letra) {
           case 'a':
           case 'e':
           case 'i':
           case 'o':
           case 'u':
               resultado = "Es una vocal";
               break;
           default:
               resultado = "No es una vocal";
               break;
       }

       // Mostramos el resultado al usuario
       JOptionPane.showMessageDialog(null, resultado);
   }
}


