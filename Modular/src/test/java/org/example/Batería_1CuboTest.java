package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Batería_1CuboTest {

    @Test
    void cubo() {


//        assertAll(
//
//        () ->  assertEquals(2,Batería_1Cubo.cubo(2)),
//        () ->  assertEquals(30,Batería_1Cubo.cubo(3))
//
//        );
        String entradaSimulada = "2";
        System.setIn(new ByteArrayInputStream(entradaSimulada.getBytes()));

        ByteArrayOutputStream salida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salida));

        assertEquals(8,Batería_1Cubo.cubo());

        String salidaEsperada = "Introduce un numero";
        assertTrue(salida.toString().contains(salidaEsperada));
//        assertEquals(30,Batería_1Cubo.cubo());

    }

    @Test
    void par() {

        assertFalse(Batería_1Cubo.par(3));
        assertTrue(Batería_1Cubo.par(2));

    }
}