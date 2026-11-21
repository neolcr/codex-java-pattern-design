package com.neol.patterns.comportamiento.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatronTest {
    @Test
    void entregaSoloAOtrosParticipantesDeLaSala() {
        var sala = new SalaChat();
        var ana = sala.incorporar("Ana");
        var luis = sala.incorporar("Luis");
        var eva = new SalaChat().incorporar("Eva");
        ana.enviar("Hola");
        assertTrue(ana.mensajes().isEmpty());
        assertTrue(eva.mensajes().isEmpty());
        assertEquals(java.util.List.of("Ana: Hola"), luis.mensajes());
        assertThrows(IllegalArgumentException.class, () -> sala.difundir(eva, "Hola"));
    }
}
