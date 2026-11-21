package com.neol.patterns.estructurales.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatronTest {
    @Test
    void convierteLaLecturaALaUnidadDelCliente() {
        Termometro termometro = new AdaptadorSensor(new SensorAntiguo(68));
        assertEquals(20.0, termometro.celsius(), 0.001);
        assertEquals(-40.0, new AdaptadorSensor(new SensorAntiguo(-40)).celsius(), 0.001);
    }
}
