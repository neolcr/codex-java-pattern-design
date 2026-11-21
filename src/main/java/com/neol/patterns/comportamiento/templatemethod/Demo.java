package com.neol.patterns.comportamiento.templatemethod;

public final class Demo {
    private Demo() {}

    public static void main(String[] args) {
        System.out.println(new ExportadorMarkdown().exportar(java.util.List.of("Café", "Té")));
    }
}
