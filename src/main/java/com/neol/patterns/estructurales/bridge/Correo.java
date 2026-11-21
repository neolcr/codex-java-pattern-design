package com.neol.patterns.estructurales.bridge;

final class Correo implements Canal {
    public String entregar(String mensaje) {
        return "Correo: " + mensaje;
    }
}
