package ejercicios;

import java.util.Scanner;

public class ejercicio09 {
    public static void main(String[] args) {
        int n, cont=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca un numero: ");
        n= sc.nextInt();

        if (n<=0){
            System.out.println("El numero no puede ser negativo");
        }else {
            while(n!=0){
                n/=10;
                cont++;
            }
            System.out.println("El numero tiene "+cont+" cifras.");
        }
    }
}
