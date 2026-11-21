package com.neol.patterns.comportamiento.state;

final class Preparando implements EstadoPedido {
    public String nombre() {
        return "Preparando";
    }

    public EstadoPedido despachar() {
        return new EnCamino();
    }
}
