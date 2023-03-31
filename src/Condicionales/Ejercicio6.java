import javax.swing.*;

public class Ejercicio6 {

    /*6)	Elaborar un programa que simule el inicio de sesión a un sistema. Si el usuario es: ”ADMIN” y
     la clave “1234” escribir el siguiente mensaje en pantalla “ACCESO PERMITIDO” caso contrario mostrar el mensaje “ACCESO DENEGADO”.*/

    public static void main(String[] args) {
        // Solicitamos al usuario que ingrese su nombre de usuario y contraseña
        String usuario = JOptionPane.showInputDialog(null, "Ingrese su nombre de usuario:");

        String contrasena = JOptionPane.showInputDialog(null, "Ingrese su contraseña:");

        // Verificamos si el usuario y la contraseña son correctos
        if (usuario.equals("ADMIN") && contrasena.equals("1234")) {
            JOptionPane.showMessageDialog(null, "ACCESO PERMITIDO");
        } else {
            JOptionPane.showMessageDialog(null, "ACCESO DENEGADO");
        }
    }
}
