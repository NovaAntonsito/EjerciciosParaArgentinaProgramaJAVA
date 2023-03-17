package Condicionales;

import java.util.Scanner;

/*
* ⦁	Escriba un programa que acepte el número de identificación de un empleado,
* el salario por hora del empleado y el total de horas trabajadas en un mes.
* Imprima la identificación y el salario del empleado de un mes en particular.
* */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idEmpleado, hours;
        double salario;

        System.out.println("Ingrese el id del empleado");
        idEmpleado = sc.nextInt();
        System.out.println("Ingrese el salario por hora");
        salario = sc.nextDouble();
        System.out.println("Ingrese las horas trabajadas en el mes");
        hours = sc.nextInt();
        sc.close();

        double salarioMensual = salario * hours;


        System.out.println("El trabajador con id " +
                idEmpleado + " sus horas trabajadas en el mes son "
                +hours+ " horas le corresponde un salario de "+ salarioMensual );

    }
}
