package ejercicios;

import java.util.Scanner;

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
