package com.neol.patterns.estructurales.proxy;

public final class Demo {
    private Demo() {}

    public static void main(String[] args) {
        Documento documento = new DocumentoDiferido(() -> new Escaneo("Acta de reunión"));
        System.out.println(documento.leer());
    }
}
