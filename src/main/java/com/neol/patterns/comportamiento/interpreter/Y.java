package com.neol.patterns.comportamiento.interpreter;

import java.util.Set;

record Y(Expresion izquierda, Expresion derecha) implements Expresion {
    public boolean evaluar(Set<String> permisos) {
        return izquierda.evaluar(permisos) && derecha.evaluar(permisos);
    }
}
