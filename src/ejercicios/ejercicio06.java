package ejercicios;

import java.util.Scanner;

/**
 * Realiza un programa que pida un número entero N entre 0 y 20 y luego
 * muestre por pantalla los números desde 1 hasta N, uno en cada línea,
 * repitiendo cada número tantas veces como su valor.
 */
public class ejercicio06 {
    public static void main(String[] args) {
        int n;

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca un valor: ");
        n= sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
