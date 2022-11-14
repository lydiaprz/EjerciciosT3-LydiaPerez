package ejercicios;

import java.util.Scanner;

public class ejercicio08 {
    public static void main(String[] args) {
        int n, //gardaremos el numero proporciionada por el usuario
            contN=0, //cuenta los numeros introducidos
            contF=0, //cuenta los fallos, osea los numeros mas pequeños
            limite; //se le asigna el ultimo numero introducido como limite
        //declaramos el scanner
        Scanner sc=new Scanner(System.in);
        //le pedimos al usuario un numero
        System.out.println("Introduzca un numero:");
        n= sc.nextInt();
        //asignamo como limite el numero
        limite=n;
        //mientras sea distinto de cero se seguira pidiendo un numero
        while (n!=0){
            //se aumenta el contador por cada numero introducido que no sea 0
            contN++;
            //si el nuevo numero es menor al anterior se dira que es un error y se aumenta el contador
            if (n<limite) {
                System.out.println("El numero es menor.");
                contF++;
            }
            //se asigna el nuevo numero como limite y se pide otro
            limite=n;
            System.out.println("Introduzca un numero:");
            n= sc.nextInt();
        }
        System.out.println("El total de numeros introducidos es "+contN);
        System.out.println("El total de fallos es "+contF);
    }
}
