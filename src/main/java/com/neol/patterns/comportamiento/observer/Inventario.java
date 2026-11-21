package com.neol.patterns.comportamiento.observer;

import java.util.ArrayList;
import java.util.List;

final class Inventario {
    private final List<ObservadorStock> observadores = new ArrayList<>();
    private int unidades;

    void suscribir(ObservadorStock observador) {
        observadores.add(observador);
    }

    void cancelar(ObservadorStock observador) {
        observadores.remove(observador);
    }

    void actualizar(int nuevasUnidades) {
        if (nuevasUnidades < 0) {
            throw new IllegalArgumentException("Las unidades no pueden ser negativas");
        }
        boolean repuesto = unidades == 0 && nuevasUnidades > 0;
        unidades = nuevasUnidades;
        if (repuesto) {
            for (var observador : List.copyOf(observadores)) {
                observador.repuesto(nuevasUnidades);
            }
        }
    }
}
