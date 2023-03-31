import javax.swing.*;

public class Ejercicio2 {

    public static void main(String[] args) {
        /*2)Realizar un programa que:
                a.	Pida 3 números que representaran notas de alumnos
                b.	Calcule el promedio de los números
                c.	Si el promedio es mayor o igual a 7, muestre por pantalla el mensaje 'APROBADO', caso contrario, mostrar el mensaje 'DESAPROBADO'.

         */
        //Ingreso y parseo de variables
        double nota1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primer nota",null));
        double nota2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota",null));
        double nota3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tercer nota",null));
        //Calculo el promedio
        double promedio=(nota1+nota2+nota3)/3;

        //Condicional
        if(promedio>=7){
            JOptionPane.showMessageDialog(null,"APROBADO CON "+promedio);
        }else{
            JOptionPane.showMessageDialog(null,"DESAPROBADO CON "+promedio);

        }

    }
}
