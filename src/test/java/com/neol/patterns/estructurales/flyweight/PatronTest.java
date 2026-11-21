package com.neol.patterns.estructurales.flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatronTest {
    @Test
    void comparteIconoPeroCadaMarcadorTieneSuPosicion() {
        var catalogo = new CatalogoIconos();
        var norte = new Marcador(catalogo.obtener("Museo"), 1, 2);
        var sur = new Marcador(catalogo.obtener("Museo"), 1, 9);
        assertSame(norte.icono(), sur.icono());
        assertNotSame(norte.icono(), catalogo.obtener("Estación"));
        assertEquals("Museo en (1, 2)", norte.dibujar());
        assertEquals("Museo en (1, 9)", sur.dibujar());
    }
}
