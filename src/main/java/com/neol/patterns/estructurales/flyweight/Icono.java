package com.neol.patterns.estructurales.flyweight;

record Icono(String simbolo) {
    String dibujar(int x, int y) {
        return "%s en (%d, %d)".formatted(simbolo, x, y);
    }
}
