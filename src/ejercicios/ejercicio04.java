package ejercicios;

import java.util.Scanner;

public class ejercicio04 {
    public static void main(String[] args) {
        int a;
        int b;
        int menor;
        int mayor = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer número: ");
        a = sc.nextInt();
        System.out.println("Introduzca el segundo número: ");
        b = sc.nextInt();

        if (a == b){
            System.out.println("Los números no pueden ser iguales");
        }

        else {
            if(a < b){
                menor = a;
                mayor = b;
            }
            else{
                menor = b;
                mayor = a;
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
            System.out.println("El Máximo Común Divisor es " + mayor);
        }

    }
}
