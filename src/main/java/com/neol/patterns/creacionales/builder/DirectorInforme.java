package com.neol.patterns.creacionales.builder;

final class DirectorInforme {
    String construir(ConstructorInforme constructor, int ventas) {
        constructor.titulo("Ventas");
        constructor.total(ventas);
        return constructor.resultado();
    }
}
