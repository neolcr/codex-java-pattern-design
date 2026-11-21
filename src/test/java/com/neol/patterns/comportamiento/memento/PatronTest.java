package com.neol.patterns.comportamiento.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatronTest {
    @Test
    void recuperaLasVersionesEnOrdenInverso() {
        var editor = new Editor();
        var historial = new Historial(editor);
        historial.guardar();
        editor.escribir("Borrador");
        historial.guardar();
        editor.escribir("Final");
        assertTrue(historial.deshacer());
        assertEquals("Borrador", editor.texto());
        assertTrue(historial.deshacer());
        assertEquals("", editor.texto());
        assertFalse(historial.deshacer());
    }
}
