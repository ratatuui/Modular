package org.example;

public class Sobrecarga {

   /* En Java podemos tener métodos con el mismo nombre (sobrecarga), pero se debe tener en cuenta que:

    Si el método tiene un parámetro, deben ser de distintos tipos en cada método.
    Si tiene más de un parámetro, al menos uno debe ser distinto.
    Si no tiene parámetros, no podemos tener métodos con el mismo nombre.*/


    public static void atacar() {
        System.out.println("ATACANDO");


    }
    public static void atacar(String nombre){

        System.out.println("te esta atacando " + nombre);
    }

    public static void atacar(int nivel){

        System.out.println("ATACANDO CON NIVEL " + nivel);
    }
    public static void main(String[] args){

        atacar("Patri");
    }
}
