package ejercicios;

import java.util.Scanner;

/**
 * las pruebas realizadas son:
 *
 */
public class ejercicio02 {
    public static void main(String[] args) {
        //la variable n donde guardaremos el numero que nos proporcione el usuario como limite
        //la variable cont para controlar las vueltas por cada numero para dividir y comprobar si es primo
        //la variable contP donde guardaremos la cantidad de primos que hay en el rango
        int n, cont=2, contP=0;
        //la variable primo para saber si un numero es primo o no
        boolean primo=true;
        //declaramos Scanner
        Scanner sc=new Scanner(System.in);
        //pedimos al usuario el numero limite
        System.out.println("Introduce un numero: ");
        n=sc.nextInt();
        //recorremos cada numero desde 1 hasta n comprobando si es primo o no
        //en caso de ser primo se guardara en la variable contP
        for (int i = 1; i < n; i++) {
            while (cont<i){
                if (i%cont==0)
                    primo=false;
                cont++;

            }
            if(primo==true){
                System.out.println(i+(" es primo"));
                contP++;
            }
        }
        System.out.println("Hay "+contP+" numeros primos.");
    }
}