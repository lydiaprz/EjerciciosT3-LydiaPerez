package ejercicios;

import java.util.Scanner;

/**
 * las pruebas hechas son:
 *
 */

public class ejercicio01 {
    public static void main(String[] args) {
        //declaramos las variables en las que guaraderos los datos de la hora
        //que nos proporcione el usuario y el incremento en segundos
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
        System.out.println("Introduzca el incremento en segundos: ");
        incremento= sc.nextInt();
        //Comprobamos que la hora es correcta
        if (horas>23||minutos>59||segundos>59||horas<0||minutos<0||segundos<0){
            System.out.println("Los valores introducidos estan fuera de rango.");
        }
        else {
            //En caso de que este dentro del rango comprobamos que si los segundos
            //superan los 59 le restaremos 60 y sumaremos uno a los minutos hasta
            //que sean menos de 60
            while ((segundos+incremento)>59){
                segundos=(segundos+incremento)-60;
                minutos+=1;
            }
            //Cuando los segundos sean menor que 60 comprobaremos los minutos y en
            //caso de que superen los 59 se les restara 60 y se sumara una hora
            while (minutos>59){
                minutos-=60;
                horas+=1;
                if (horas>23){
                    horas=0;
                }
            }
        }
        System.out.println("La hora es: "+horas+":"+minutos+":"+segundos);
    }
}
