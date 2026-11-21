package com.neol.patterns.comportamiento.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatronTest {
    @Test
    void interpretaLaMismaReglaConDistintosPermisos() {
        Expresion regla = new Y(new Permiso("leer"), new O(new Permiso("editar"), new Permiso("revisar")));
        assertTrue(regla.evaluar(java.util.Set.of("leer", "editar")));
        assertTrue(regla.evaluar(java.util.Set.of("leer", "revisar")));
        assertFalse(regla.evaluar(java.util.Set.of("leer")));
        assertFalse(regla.evaluar(java.util.Set.of("revisar")));
    }
}
