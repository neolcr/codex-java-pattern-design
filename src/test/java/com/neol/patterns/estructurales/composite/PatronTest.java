package com.neol.patterns.estructurales.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatronTest {
    @Test
    void sumaRecursivamenteLosArchivos() {
        Entrada vacia = new Carpeta(java.util.List.of());
        Entrada subcarpeta = new Carpeta(java.util.List.of(new Archivo(10), vacia));
        Entrada raiz = new Carpeta(java.util.List.of(new Archivo(5), subcarpeta));
        assertEquals(0, vacia.bytes());
        assertEquals(15, raiz.bytes());
    }
}
