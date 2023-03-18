package Repetitivas;
/*
* Simular el comportamiento de un reloj digital,
* imprimiendo la hora, minutos y segundos de un día desde las 0:00:00 horas hasta las 23:59:59 horas
* */
public class Ejercicio12 {
    public static void main(String[] args){
        int horas = 0, minutos = 0, segundos = 0;
        while (horas < 24) {
            System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
            segundos++;
            if (segundos == 60) {
                segundos = 0;
                minutos++;
            }
            if (minutos == 60) {
                minutos = 0;
                horas++;
            }
        }
    }
}
