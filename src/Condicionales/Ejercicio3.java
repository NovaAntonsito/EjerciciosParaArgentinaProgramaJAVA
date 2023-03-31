import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*3)- La rotisería del pueblo necesita saber si posee el stock mínimo para vender pizzas el próximo fin de semana.
        Sabiendo que el número mínimo de stock es 50 pizzas. Codifique un programa que, ingresando el número de stock disponible,
        notifique si se podrá vender pizzas el fin de semana, caso contrario indique el stock faltante.
         */
        int stock=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de pizzas en stock",null));

        //Condicional
        if(stock>=50){
            JOptionPane.showMessageDialog(null,"Se podran vender pizzas este fin de semana");
        }else{
            JOptionPane.showMessageDialog(null,"Lo sentimos, se necesitan "+(50-stock)+" pizzas para completar el faltante de stock " );

        }

    }
}
