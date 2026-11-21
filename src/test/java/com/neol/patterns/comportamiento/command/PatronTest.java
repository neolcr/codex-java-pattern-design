package com.neol.patterns.comportamiento.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatronTest {
    @Test
    void difiereLasOrdenesYLasEjecutaEnOrdenUnaVez() {
        var impresora = new Impresora();
        var cola = new ColaImpresion();
        cola.programar(new Imprimir(impresora, "Factura"));
        cola.programar(new Imprimir(impresora, "Recibo"));
        assertTrue(impresora.paginas().isEmpty());
        cola.procesar();
        cola.procesar();
        assertEquals(java.util.List.of("Factura", "Recibo"), impresora.paginas());
    }
}
