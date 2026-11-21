package com.neol.patterns.estructurales.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatronTest {
    @Test
    void combinaPrioridadYCanalDeFormaIndependiente() {
        assertEquals("Correo: Reunión", new Aviso(new Correo()).enviar("Reunión"));
        assertEquals("SMS: Reunión", new Aviso(new Sms()).enviar("Reunión"));
        assertEquals("Correo: [Urgente] Revisar", new AvisoUrgente(new Correo()).enviar("Revisar"));
        assertEquals("SMS: [Urgente] Revisar", new AvisoUrgente(new Sms()).enviar("Revisar"));
    }
}
