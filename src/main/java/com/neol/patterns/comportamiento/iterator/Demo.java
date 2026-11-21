package com.neol.patterns.comportamiento.iterator;

public final class Demo {
    private Demo() {}

    public static void main(String[] args) {
        for (String parada : new Ruta(java.util.List.of("Norte", "Centro", "Sur"))) {
            System.out.println(parada);
        }
    }
}
