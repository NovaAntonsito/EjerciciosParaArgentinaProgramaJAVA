import javax.swing.JOptionPane;
public class Ejercicio16 {

        public static void main(String[] args) {
            double importeNeto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el importe neto de la factura:"));
            double importeFinal;

            if (importeNeto < 10000) {
                importeFinal = importeNeto;
            } else {
                importeFinal = importeNeto * 0.85; // Se aplica un descuento del 15%
            }

            JOptionPane.showMessageDialog(null, "El importe final de la factura es: $" + importeFinal);
        }
}


