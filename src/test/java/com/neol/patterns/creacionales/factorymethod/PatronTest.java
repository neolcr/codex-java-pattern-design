package com.neol.patterns.creacionales.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatronTest {
    @Test
    void usaElLectorDelFormato() {
        assertEquals(2, new ImportadorCsv().contarContactos("Ana,Luis"));
        assertEquals(2, new ImportadorTsv().contarContactos("Ana\tLuis"));
        assertEquals(1, new ImportadorTsv().contarContactos("Ana,Luis"));
    }
}
