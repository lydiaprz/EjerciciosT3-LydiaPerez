package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main (String[] args){
        int n1,
            n2,
            menor,
            mayor = 0,
            mcm;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer número: ");
        n1 = sc.nextInt();
        System.out.println("Introduzca el segundo número: ");
        n2 = sc.nextInt();

        if (n1 == n2){
            System.out.println("Los números no pueden ser iguales");
        }else {
            if(n1 < n2){
                menor = n1;
                mayor = n2;
            }else{
                menor = n2;
                mayor = n1;
            }

            for (int i = menor; i >=1 ; i--) {
                for (int j = i; j >=1; j--) {
                    if(i % j == 0 && mayor % j == 0) {
                        mayor = j;
                        break;
                    }
                }
                break;
            }
            mcm=(n1/mayor)*n2;
            System.out.println("El Mínimo Común Múltiplo es " + mcm);
        }
    }
}
