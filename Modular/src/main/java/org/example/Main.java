package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {

        int  num =10;
        int numero = funcion(num,new String[] {"mahmoud","Patri"});

        System.out.println(numero);

        procedimiento();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        pintar_nombre("patri","kevin","david");



    }
        // Tipos de métodos
    // devolver al main
    public static int funcion(int numero, String[] nombres){

    //    int length = nombres.length;
        System.out.println("Hola " + Arrays.toString(nombres));
        numero = numero + 20;
        return numero * 10;

    }
    // no devuelve al main
    public static void procedimiento(){
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Hola soy un procedimiento y hago cosas sin devolver nada(return) ");

    }
    public static void  pintar_nombre(String...nombre){
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");

        for (String nom : nombre){
            System.out.println(nom);
        }

    }
}
