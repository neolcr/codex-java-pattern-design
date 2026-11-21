package com.neol.patterns.creacionales.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatronTest {
    @Test
    void creaProductosDeLaRegionElegida() {
        FabricaRegion local = new FabricaEspanola();
        FabricaRegion britanica = new FabricaBritanica();
        assertEquals("Pagar", local.crearBoton().etiqueta());
        assertEquals("20 €", local.crearFormato().formatear(20));
        assertEquals("Pay", britanica.crearBoton().etiqueta());
        assertEquals("£20", britanica.crearFormato().formatear(20));
    }
}
