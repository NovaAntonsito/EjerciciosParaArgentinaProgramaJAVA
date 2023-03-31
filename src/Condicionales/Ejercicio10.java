import javax.swing.*;

public class Ejercicio10 {
    /*10)	Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un según para ello.*/
    public static void main(String[] args) {
        String dia = JOptionPane.showInputDialog("Introduce un día de la semana:");
        //usamos esta funcion de String para que coincidan con nuestros casos de switch
        switch (dia.toLowerCase()) {
            case "lunes":
            case "martes":
            case "miércoles":
            case "jueves":
            case "viernes":
                JOptionPane.showMessageDialog(null, dia + " es un día laboral.");
                break;
            default:
                JOptionPane.showMessageDialog(null, dia + " no es un día laboral.");
                break;
        }
    }
}
