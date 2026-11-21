package com.neol.patterns.comportamiento.visitor;

public final class Demo {
    private Demo() {}

    public static void main(String[] args) {
        Envio envio = new Paquete("Oviedo", 2);
        System.out.println(envio.aceptar(new DescribirEnvio()));
        System.out.println(envio.aceptar(new CalcularCoste()));
    }
}
