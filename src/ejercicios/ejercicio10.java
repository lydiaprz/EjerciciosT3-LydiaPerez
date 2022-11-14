package ejercicios;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        int n, //guardaremos el numero para despues compararlo con el inverso
            aux, //le asignamos el valor de n e iremos modificandolo para pasarle las cifras el inverso
            cifra, //guardamos cada cifra que le vamos quitando al aux
            inverso = 0; //iremos introduciendo el valor de n cifra por cifra desde atras hacia delante
        //declaramos el scanner
        Scanner sc = new Scanner(System.in);
        //le pedimos al usuario un numero
        System.out.println("Introduzca un numero:");
        n= sc.nextInt();
        //le asignamos aaux el valor de n para no modificarlo directamente en n y perderlo
        aux=n;
        //mientras el numero no se quede sin cifras, osea valga 0, irle
        // asignando a cifra la ultima cifra del numero e interoduciendola en la variable inverso
        while(aux!=0){
            cifra=aux%10;
            aux/=10;
            inverso=(inverso*10)+cifra;
        }
        //comparar ambas variables para saber si el numero es capicua
        if(inverso==n){
            System.out.println("El numero es capicua.");
        }else {
            System.out.println("El numero no es capicua.");
        }
    }
}
