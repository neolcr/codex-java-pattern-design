package com.neol.patterns.creacionales.factorymethod;

public final class Demo {
    private Demo() {}

    public static void main(String[] args) {
        System.out.println(new ImportadorCsv().contarContactos("Ana,Luis"));
    }
}
