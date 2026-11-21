package com.neol.patterns.comportamiento.mediator;

import java.util.ArrayList;
import java.util.List;

final class SalaChat implements MediadorChat {
    private final List<Participante> miembros = new ArrayList<>();

    Participante incorporar(String nombre) {
        var participante = new Participante(nombre, this);
        miembros.add(participante);
        return participante;
    }

    public void difundir(Participante emisor, String texto) {
        if (!miembros.contains(emisor)) {
            throw new IllegalArgumentException("El emisor no pertenece a la sala");
        }
        for (var miembro : miembros) {
            if (miembro != emisor) {
                miembro.recibir(emisor.nombre(), texto);
            }
        }
    }
}
