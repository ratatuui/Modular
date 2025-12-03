package org.example;

import java.util.Scanner;

public class Batería_3Cadena {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena de palabras");

        String cadena = teclado.nextLine();
        //son cadenas diferentes
        cadena = mayus(cadena);

        System.out.println(cadena);

        int total_vocales=contarVocales(cadena);
        System.out.println("Vocales totales " + total_vocales);


    }

    public static String mayus(String cadena){

      //  cadena = cadena.toUpperCase(); return cadena;
        return cadena.toUpperCase();

    }

    public static int contarVocales(String cadena){

        int a =0;
        int e =0;
        int i =0;
        int o =0;
        int u =0;
        for (int j = 0; j <cadena.length(); j++) {

            switch (cadena.charAt(j)){

                case 'A':
                    a++;
                    break;
                case 'E':
                    e++;
                    break;
                case 'I':
                    i++;
                    break;
                case 'O':
                    o++;
                    break;
                case 'U':
                    u++;
                    break;

            }

        }
        System.out.println("A: " + a);
        System.out.println("e: " + e);
        System.out.println("i: " + i);
        System.out.println("o: " + o);
        System.out.println("u: " + u);

        return a+e+i+o+u;
    }
}
