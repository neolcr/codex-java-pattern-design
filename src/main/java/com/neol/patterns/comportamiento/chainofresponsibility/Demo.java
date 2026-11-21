package com.neol.patterns.comportamiento.chainofresponsibility;

public final class Demo {
    private Demo() {}

    public static void main(String[] args) {
        var soporte = new MesaAyuda(new Especialista(null));
        System.out.println(soporte.atender("Red").orElse("Sin asignar"));
    }
}
