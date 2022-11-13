package ejercicios;

import java.util.Scanner;

public class ejercicio08 {
    public static void main(String[] args) {
        int n, contN=0, contF=0, mayor;
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca un numero:");
        n= sc.nextInt();
        mayor=n;
        while (n!=0){
            contN++;
            if (n<mayor) {
                System.out.println("El numero es menor.");
                contF++;
            }
            mayor=n;
            System.out.println("Introduzca un numero:");
            n= sc.nextInt();
        }
        System.out.println("El total de numeros introducidos es "+contN);
        System.out.println("El total de fallos es "+contF);
    }
}
