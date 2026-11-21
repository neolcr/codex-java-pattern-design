package com.neol.patterns.creacionales.builder;

public final class Demo {
    private Demo() {}

    public static void main(String[] args) {
        System.out.println(new DirectorInforme().construir(new ConstructorMarkdown(), 12));
    }
}
