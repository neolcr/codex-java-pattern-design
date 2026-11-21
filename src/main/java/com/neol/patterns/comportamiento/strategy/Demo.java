package com.neol.patterns.comportamiento.strategy;

public final class Demo {
    private Demo() {}

    public static void main(String[] args) {
        var caja = new Caja(new EnvioEstandar());
        System.out.println(caja.total(3_000));
        caja.elegirTarifa(new Recogida());
        System.out.println(caja.total(3_000));
    }
}
