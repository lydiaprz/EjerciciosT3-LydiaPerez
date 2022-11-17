package ejercicios;

import java.util.Scanner;

/**
 * las pruebas realizadas son:
 * 7
 * 1
 * 22
 * 333
 * 4444
 * 55555
 * 666666
 * 7777777
 */
public class ejercicio06 {
    public static void main(String[] args) {
        //declaramos la variable del numero que nos proporcionara el usuario
        int n;
        //declaramos el scanner
        Scanner sc=new Scanner(System.in);
        //pedimos el numero al usuario
        System.out.println("Introduzca un valor: ");
        n= sc.nextInt();
        //recorremos cada numero desde 1 hasta n imprimiendo cada numero las veces de su valor
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
