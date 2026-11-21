package com.neol.patterns.estructurales.decorator;

record ConCanela(Bebida base) implements Bebida {
    public int centimos() {
        return base.centimos() + 20;
    }
}
