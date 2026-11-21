package com.neol.patterns.comportamiento.mediator;

import java.util.ArrayList;
import java.util.List;

final class Participante {
    private final String nombre;
    private final MediadorChat mediador;
    private final List<String> mensajes = new ArrayList<>();

    Participante(String nombre, MediadorChat mediador) {
        this.nombre = nombre;
        this.mediador = mediador;
    }

    String nombre() {
        return nombre;
    }

    void enviar(String texto) {
        mediador.difundir(this, texto);
    }

    void recibir(String emisor, String texto) {
        mensajes.add("%s: %s".formatted(emisor, texto));
    }

    List<String> mensajes() {
        return List.copyOf(mensajes);
    }
}
