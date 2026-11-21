package com.neol.patterns.comportamiento.state;

final class EnCamino implements EstadoPedido {
    public String nombre() {
        return "En camino";
    }

    public EstadoPedido entregar() {
        return new Entregado();
    }
}
