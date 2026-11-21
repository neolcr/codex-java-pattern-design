package com.neol.patterns.comportamiento.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatronTest {
    @Test
    void notificaLaReposicionSoloALosSuscriptoresActivos() {
        var inventario = new Inventario();
        var avisos = new java.util.ArrayList<Integer>();
        var otros = new java.util.ArrayList<Integer>();
        ObservadorStock observador = avisos::add;
        inventario.suscribir(observador);
        inventario.suscribir(otros::add);
        inventario.actualizar(3);
        inventario.actualizar(4);
        inventario.cancelar(observador);
        inventario.actualizar(0);
        inventario.actualizar(2);
        assertEquals(java.util.List.of(3), avisos);
        assertEquals(java.util.List.of(3, 2), otros);
    }
}
