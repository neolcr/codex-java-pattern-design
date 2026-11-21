package com.neol.patterns.estructurales.bridge;

public final class Demo {
    private Demo() {}

    public static void main(String[] args) {
        System.out.println(new AvisoUrgente(new Sms()).enviar("Revisar servidor"));
    }
}
