package ejercicios;

import java.util.Scanner;

public class ejercicio03 {

    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner (System.in);

        System.out.print("Introduzca una base y altura para el triángulo: ");
        num = sc.nextInt();

        for(int i = 1; i <= num; i++) {
            for(int j = i; j <= num; j++) {
                System.out.print(" ");
            }
            for(int k = i ; k > 0; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }

}
