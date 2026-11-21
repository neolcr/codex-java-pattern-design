package com.neol.patterns.estructurales.facade;

final class Aforo {
    private int plazas;

    Aforo(int plazas) {
        this.plazas = plazas;
    }

    boolean reservar() {
        if (plazas <= 0) {
            return false;
        }
        plazas--;
        return true;
    }
}
