package com.neol.patterns.comportamiento.mediator;

public final class Demo {
    private Demo() {}

    public static void main(String[] args) {
        var sala = new SalaChat();
        var ana = sala.incorporar("Ana");
        var luis = sala.incorporar("Luis");
        ana.enviar("Reunión a las diez");
        System.out.println(luis.mensajes());
    }
}
