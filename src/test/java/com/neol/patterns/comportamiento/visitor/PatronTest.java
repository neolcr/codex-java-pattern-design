package com.neol.patterns.comportamiento.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatronTest {
    @Test
    void eligeLaOperacionYLaSobrecargaSegunElTipoDeEnvio() {
        Envio carta = new Carta("Gijón");
        Envio paquete = new Paquete("Oviedo", 2);
        var coste = new CalcularCoste();
        var descripcion = new DescribirEnvio();
        assertEquals(120, carta.aceptar(coste));
        assertEquals(550, paquete.aceptar(coste));
        assertEquals("Carta a Gijón", carta.aceptar(descripcion));
        assertEquals("Paquete de 2 kg a Oviedo", paquete.aceptar(descripcion));
    }
}
