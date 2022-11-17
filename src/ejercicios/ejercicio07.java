package ejercicios;

import java.util.Scanner;

/**
 * las pruebas realizadas son:
 * 7
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 * 1 6 15 20 15 6 1
 */
public class ejercicio07 {
    public static void main(String[] args) {
        //declaramos la variable donde guardaremos la altura que nos indique el usuario
        int n, aux;
        //declaramos el scanner
        Scanner sc=new Scanner(System.in);
        //le pedimos al usuario la altura
        System.out.println("¿Que altura desea que tenga la pirámide de Tartaglia?");
        n= sc.nextInt();
        //
        for (int i = 0; i < n; i++) {
            aux=1;
            System.out.print(aux+" ");
            for (int j = 0; j < i; j++) {
                aux=aux*(i-j)/(j+1);
                System.out.print(aux+" ");
            }
            System.out.println();
        }
    }
}
