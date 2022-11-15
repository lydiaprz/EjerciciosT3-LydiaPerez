package ejercicios;

import java.util.Scanner;

public class ejercicio09 {
    public static void main(String[] args) {
        int n, //numero que nos indique el usuario
                cont=0;//contador de cifras
        //declaramos scanner
        Scanner sc=new Scanner(System.in);
        //pedimos el numero al usuario
        System.out.println("Introduzca un numero: ");
        n= sc.nextInt();
        //comprobamos que el numero no es negativo
        if (n<=0){
            System.out.println("El numero no puede ser negativo");
        }else {
            //mientra s el numero tenga cifras, no sea igual a cero,
            // se ira dividiendo entre 10, osea quitandole una cifra, y aumentando el contador
            while(n!=0){
                n/=10;
                cont++;
            }
            System.out.println("El numero tiene "+cont+" cifras.");
        }
    }
}
