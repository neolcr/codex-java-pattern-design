package com.neol.patterns.comportamiento.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatronTest {
    @Test
    void recorreEnOrdenInversoConCursoresIndependientes() {
        var ruta = new Ruta(java.util.List.of("Norte", "Sur"));
        var primero = ruta.iterator();
        var segundo = ruta.iterator();
        assertEquals("Sur", primero.next());
        assertEquals("Norte", primero.next());
        assertFalse(primero.hasNext());
        assertThrows(java.util.NoSuchElementException.class, primero::next);
        assertEquals("Sur", segundo.next());
    }
}
