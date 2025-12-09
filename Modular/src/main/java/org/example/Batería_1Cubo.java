package org.example;

import java.util.Scanner;

public class Batería_1Cubo {

    static void main() {

    }
    public static int cubo(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = teclado.nextInt();

        return numero*numero*numero;
    }

    public static boolean par(int numero){

        if (numero%2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
