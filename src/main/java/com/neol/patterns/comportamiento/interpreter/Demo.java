package com.neol.patterns.comportamiento.interpreter;

public final class Demo {
    private Demo() {}

    public static void main(String[] args) {
        Expresion regla = new Y(new Permiso("leer"), new O(new Permiso("editar"), new Permiso("revisar")));
        System.out.println(regla.evaluar(java.util.Set.of("leer", "revisar")));
    }
}
