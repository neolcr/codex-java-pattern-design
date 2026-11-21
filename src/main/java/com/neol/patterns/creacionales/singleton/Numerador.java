package com.neol.patterns.creacionales.singleton;

import java.util.concurrent.atomic.AtomicInteger;

enum Numerador {
    INSTANCIA;

    private final AtomicInteger ultimo = new AtomicInteger();

    int siguiente() {
        return ultimo.incrementAndGet();
    }
}
