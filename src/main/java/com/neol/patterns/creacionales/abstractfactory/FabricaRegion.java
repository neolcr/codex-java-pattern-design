package com.neol.patterns.creacionales.abstractfactory;

interface FabricaRegion {
    BotonPago crearBoton();
    FormatoMoneda crearFormato();
}
