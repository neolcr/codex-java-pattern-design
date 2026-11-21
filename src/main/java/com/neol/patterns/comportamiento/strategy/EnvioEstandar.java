package com.neol.patterns.comportamiento.strategy;

final class EnvioEstandar implements TarifaEnvio {
    public int coste(int subtotal) {
        return subtotal >= 5_000 ? 0 : 450;
    }
}
