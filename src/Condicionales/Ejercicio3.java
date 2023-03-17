package Condicionales;

import java.util.Scanner;
/*
*Escriba un programa en PSeInt que calcule las raíces de una ecuación, usando la ecuación de segundo grado.
* */
public class Ejercicio3 {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);
        //Defino las variables y las inicializo
        System.out.println("Ingrese los coeficientes de la ecuación de segundo grado ax^2 + bx + c = 0: ");
        System.out.print("a: ");
        double a = sc.nextDouble();

        System.out.print("b: ");
        double b = sc.nextDouble();

        System.out.print("c: ");
        double c = sc.nextDouble();

        //Saco la discriminante
        double discriminante = b * b - 4 * a * c;

        //Determino las raices de la operacion
        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("Las raíces son: " + raiz1 + " y " + raiz2);
        } else if (discriminante == 0) {
            //Si la discriminante es 0 saco la unica raiz que tiene
            double raiz = -b / (2 * a);
            System.out.println("La única raíz es: " + raiz);
        } else {
            //Si da un numero negativo doy error
            System.out.println("No existen raíces reales.");
        }

        sc.close();

    }
}
