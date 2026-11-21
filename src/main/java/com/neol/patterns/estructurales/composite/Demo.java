package com.neol.patterns.estructurales.composite;

public final class Demo {
    private Demo() {}

    public static void main(String[] args) {
        Entrada raiz = new Carpeta(java.util.List.of(new Archivo(12), new Carpeta(java.util.List.of(new Archivo(30)))));
        System.out.println(raiz.bytes());
    }
}
