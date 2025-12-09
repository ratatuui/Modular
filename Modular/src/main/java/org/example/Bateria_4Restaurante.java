package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Bateria_4Restaurante {

    static Scanner teclado;

    static void main() {
        System.out.println("Introduce la recaudación semanal");

      double recaudacion[] =   introducir_Recaudacion();
        System.out.println(Arrays.toString(recaudacion));

        System.out.println(diaMaximo(recaudacion));


        double media = media(recaudacion);
        System.out.println(media);

        double domingo = domingo(recaudacion);
        System.out.println(domingo);

        if (domingo > media){
            System.out.println("SI");
        }else {
            System.out.println("NO");
        }
        /**
         * @Autor_MahmoudCheikhMoussa
         * version 1.0
         * @retur_jhgcuheuhu
         */


    }
    public static double[]introducir_Recaudacion(){

         teclado = new Scanner(System.in);

        double recaudacion[] = new double[6];

        for (int i = 0; i < recaudacion.length; i++) {

            recaudacion[i] = teclado.nextDouble();

        }

        return recaudacion;


    }
    public  static String diaMaximo(double recaudacion[]){

        double maximo = recaudacion[0];
        int dia = 0;

        for (int i = 0; i < recaudacion.length ; i++) {

            if (recaudacion[i]> maximo){

                maximo = recaudacion[i];

                dia = i;
            }

        }

        return dia_semana(dia);


    }
    public static String dia_semana (int dia){

        switch (dia){
            case 0:
                return "MARTES";
            case 1:
                return "MIERCOLES";
            case 2:
                return "JUEVES";
            case 3:
                return "Viernes";
            case 4:
                return "SABADO";
            case 5:
                return "DOMINGO";
        }
        return "";
    }
    //Calculamos la med

    public static double media(double recaudacion[]){

        double acumulado =0;

        for (int i = 0; i < recaudacion.length; i++) {

            acumulado += recaudacion[i];


        }
        return (acumulado/ recaudacion.length);
    }
    public static double domingo (double[] recaudacion ){




        return recaudacion[recaudacion.length -1];
    }


}
