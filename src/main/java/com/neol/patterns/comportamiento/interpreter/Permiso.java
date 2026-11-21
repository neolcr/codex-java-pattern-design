package com.neol.patterns.comportamiento.interpreter;

import java.util.Set;

record Permiso(String nombre) implements Expresion {
    public boolean evaluar(Set<String> permisos) {
        return permisos.contains(nombre);
    }
}
