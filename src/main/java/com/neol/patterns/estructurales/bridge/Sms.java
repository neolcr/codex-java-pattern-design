package com.neol.patterns.estructurales.bridge;

final class Sms implements Canal {
    public String entregar(String mensaje) {
        return "SMS: " + mensaje;
    }
}
