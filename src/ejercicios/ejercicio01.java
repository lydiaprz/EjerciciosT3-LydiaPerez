package ejercicios;

import java.util.Scanner;

/**
 * Escribe un programa que incremente la hora de un reloj. Se pedirán por teclado:
 * Hora
 * Minutos
 * Segundos
 * Cantidad de segundos a incrementar
 * La aplicación debe mostrar la nueva hora. Por ejemplo, si el usuario introduce
 * hora=13, minutos=59 y segundos=51, y se desea incrementar en 10 segundos, el
 * resultado a mostrar es 14:00:01.
 */

public class ejercicio01 {
    public static void main(String[] args) {
        //declaramos las variables
        int horas, minutos, segundos, incremento;
        //declaramos scanner
        Scanner sc=new Scanner(System.in);
        //pedimos la hora y el incremento
        System.out.println("Introduzca las horas: ");
        horas= sc.nextInt();
        System.out.println("Introduzca los minutos: ");
        minutos= sc.nextInt();
        System.out.println("Introduzca los segundos: ");
        segundos= sc.nextInt();
        System.out.println("Introduzca el incremento: ");
        incremento= sc.nextInt();

        if (horas>23||minutos>59||segundos>59||horas<0||minutos<0||segundos<0){
            System.out.println("Los valores introducidos estan fuera de rango.");
        }
        else {
            while ((segundos+incremento)>59){
                segundos=(segundos+incremento)-60;
                minutos+=1;
            }
            while (minutos>60){
                minutos-=60;
                horas+=1;
                if (horas>23){
                    horas=0;
                }
            }
        }
    }
}
