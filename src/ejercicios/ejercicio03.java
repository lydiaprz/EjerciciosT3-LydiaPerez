package ejercicios;

import java.util.Scanner;

public class ejercicio03 {

    public static void main(String[] args) {
        //declaro la variable donde recogeremos el valor de la base y
        // altura que al ser un triángulo equilatero será igual
        int num;
        //declaramos ek scanner
        Scanner sc = new Scanner (System.in);
        //le pedimos al usuario la base y altura
        System.out.print("Introduzca una valor para el triangulo: ");
        num = sc.nextInt();
        //declaramos el for que nos recorrera la altura
        for(int i = 1; i <= num; i++) {
            //declaramos un for para imprimir los espacios y otro para imprimir el caracter
            for(int j = i; j <= num; j++) {
                System.out.print(" ");
            }
            for(int k = i ; k > 0; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
