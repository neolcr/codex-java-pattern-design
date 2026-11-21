package com.neol.patterns.comportamiento.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatronTest {
    @Test
    void conservaLaSecuenciaYDelegaElFormato() {
        var productos = java.util.List.of("Café", "Té");
        assertEquals("Productos\nCafé\nTé", new ExportadorTexto().exportar(productos));
        assertEquals("# Productos\n- Café\n- Té", new ExportadorMarkdown().exportar(productos));
        assertEquals("# Productos", new ExportadorMarkdown().exportar(java.util.List.of()));
    }
}
