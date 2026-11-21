package com.neol.patterns.creacionales.singleton;

public final class Demo {
    private Demo() {}

    public static void main(String[] args) {
        System.out.println(Numerador.INSTANCIA.siguiente());
    }
}
