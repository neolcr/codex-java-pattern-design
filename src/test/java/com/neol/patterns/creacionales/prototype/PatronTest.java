package com.neol.patterns.creacionales.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatronTest {
    @Test
    void copiaElEstadoSinCompartirLaColeccionMutable() {
        var plantilla = new ListaTareas(java.util.List.of("Sala"));
        var copia = plantilla.copiar();
        assertNotSame(plantilla, copia);
        assertEquals(plantilla.tareas(), copia.tareas());
        copia.agregar("Invitados");
        assertEquals(java.util.List.of("Sala"), plantilla.tareas());
        assertEquals(java.util.List.of("Sala", "Invitados"), copia.tareas());
    }
}
