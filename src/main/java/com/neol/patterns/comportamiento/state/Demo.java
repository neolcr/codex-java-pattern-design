package com.neol.patterns.comportamiento.state;

public final class Demo {
    private Demo() {}

    public static void main(String[] args) {
        var pedido = new Pedido();
        pedido.despachar();
        System.out.println(pedido.estado());
        pedido.entregar();
        System.out.println(pedido.estado());
    }
}
