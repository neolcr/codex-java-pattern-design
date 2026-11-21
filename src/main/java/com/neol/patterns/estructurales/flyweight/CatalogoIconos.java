package com.neol.patterns.estructurales.flyweight;

import java.util.HashMap;
import java.util.Map;

final class CatalogoIconos {
    private final Map<String, Icono> iconos = new HashMap<>();

    Icono obtener(String simbolo) {
        return iconos.computeIfAbsent(simbolo, Icono::new);
    }
}
