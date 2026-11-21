package com.neol.patterns.estructurales.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatronTest {
    @Test
    void acumulaLosExtrasYConservaElPrecioBase() {
        Bebida cafe = new Cafe();
        Bebida conLeche = new ConLeche(cafe);
        assertEquals(150, cafe.centimos());
        assertEquals(190, conLeche.centimos());
        assertEquals(210, new ConCanela(conLeche).centimos());
    }
}
