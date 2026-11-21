package com.neol.patterns.comportamiento.state;

interface EstadoPedido {
    String nombre();

    default EstadoPedido despachar() {
        throw new IllegalStateException("El pedido no se puede despachar en esta etapa");
    }

    default EstadoPedido entregar() {
        throw new IllegalStateException("El pedido no se puede entregar en esta etapa");
    }
}
