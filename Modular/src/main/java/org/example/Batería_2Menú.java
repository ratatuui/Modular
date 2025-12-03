package org.example;

import java.util.Scanner;

public class Batería_2Menú {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        imprimirMenu();

        System.out.println("Teclea tu opción");

        char opcion = teclado.next().charAt(8);

      if( validarOpcion(opcion)){
          System.out.println("Valida");
      }else {
          System.out.println("No Valida");
      }
    }

    public static void imprimirMenu (){

        System.out.println("*Bienvenido");
        System.out.println("1 Cantar");
        System.out.println("2 Bailar");
        System.out.println("3 Hacer backflip");
        System.out.println("X Salir");
    }

    public static boolean validarOpcion (char opcion){

        switch (opcion){

            case '1' :
            case '2' :
            case '3':
            case'X':
                return true;
            default:
                return false;
        }

    }
}
