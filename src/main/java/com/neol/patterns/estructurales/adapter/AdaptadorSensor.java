package com.neol.patterns.estructurales.adapter;

record AdaptadorSensor(SensorAntiguo sensor) implements Termometro {
    public double celsius() {
        return (sensor.fahrenheit() - 32) * 5 / 9;
    }
}
