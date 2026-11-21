package com.neol.patterns.creacionales.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatronTest {
    @Test
    void construyeRepresentacionesDistintasConLaMismaReceta() {
        var director = new DirectorInforme();
        assertEquals("Ventas\nTotal: 12", director.construir(new ConstructorTexto(), 12));
        assertEquals("# Ventas\n\n**Total**: 12", director.construir(new ConstructorMarkdown(), 12));
    }
}
