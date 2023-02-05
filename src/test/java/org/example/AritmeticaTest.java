package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AritmeticaTest {

    @Test
    @DisplayName("Test de la suma")
    void sumarTest() {
        Aritmetica aobj = new Aritmetica();
        assertEquals( aobj.sumar(5.0, 1.0), 6.0);
    }
}