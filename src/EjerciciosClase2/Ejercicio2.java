package EjerciciosClase2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        //Perferia hacerlo asi char vocal = sc.next().charAt(0); pero para mejor legibilidad lo dejo asi
        //Variables y scanner
        Scanner sc = new Scanner(System.in);
        char vocal;

        //Inicializo la variable
        vocal = sc.next().charAt(0);

        //Use un fallthough para ahorrar el codigo, determina si es vocal o no
        switch (vocal){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Es vocal!");
                break;
            default:
                System.out.println("No es vocal :(");
        }

    }
}
