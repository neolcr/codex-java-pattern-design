package com.neol.patterns.estructurales.flyweight;

record Marcador(Icono icono, int x, int y) {
    String dibujar() {
        return icono.dibujar(x, y);
    }
}
