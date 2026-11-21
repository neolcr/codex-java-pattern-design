package com.neol.patterns.estructurales.decorator;

record ConLeche(Bebida base) implements Bebida {
    public int centimos() {
        return base.centimos() + 40;
    }
}
