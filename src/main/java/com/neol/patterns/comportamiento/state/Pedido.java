package com.neol.patterns.comportamiento.state;

final class Pedido {
    private EstadoPedido estado = new Preparando();

    void despachar() {
        estado = estado.despachar();
    }

    void entregar() {
        estado = estado.entregar();
    }

    String estado() {
        return estado.nombre();
    }
}
