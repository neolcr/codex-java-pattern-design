package com.neol.patterns.comportamiento.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatronTest {
    @Test
    void aplicaLasTransicionesDeCadaEstado() {
        var pedido = new Pedido();
        assertThrows(IllegalStateException.class, pedido::entregar);
        assertEquals("Preparando", pedido.estado());
        pedido.despachar();
        assertEquals("En camino", pedido.estado());
        assertThrows(IllegalStateException.class, pedido::despachar);
        pedido.entregar();
        assertEquals("Entregado", pedido.estado());
        assertThrows(IllegalStateException.class, pedido::entregar);
    }
}
