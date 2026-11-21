package com.neol.patterns.estructurales.adapter;

public final class Demo {
    private Demo() {}

    public static void main(String[] args) {
        Termometro termometro = new AdaptadorSensor(new SensorAntiguo(68));
        System.out.println(termometro.celsius());
    }
}
