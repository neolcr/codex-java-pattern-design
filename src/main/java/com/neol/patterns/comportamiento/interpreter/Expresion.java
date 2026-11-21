package com.neol.patterns.comportamiento.interpreter;

import java.util.Set;

interface Expresion {
    boolean evaluar(Set<String> permisos);
}
