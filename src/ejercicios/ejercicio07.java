package ejercicios;

import java.util.Scanner;

public class ejercicio07 {
    public static void main(String[] args) {
        int n, x = 0, y = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Que altura desea que tenga la pirámide de Tartaglia?");
        n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {

                System.out.println(n);
                x++;
                y++;
            }
        }
    }
}
