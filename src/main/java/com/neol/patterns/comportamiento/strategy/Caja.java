package com.neol.patterns.comportamiento.strategy;

final class Caja {
    private TarifaEnvio tarifa;

    Caja(TarifaEnvio tarifa) {
        elegirTarifa(tarifa);
    }

    void elegirTarifa(TarifaEnvio tarifa) {
        this.tarifa = java.util.Objects.requireNonNull(tarifa);
    }

    int total(int subtotal) {
        return Math.addExact(subtotal, tarifa.coste(subtotal));
    }
}
