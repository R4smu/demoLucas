package com.mazmorron.modelo;

public class Celda {
    private TipoCelda tipo;
    private Personaje ocupante;

    public Celda(TipoCelda tipo) {
        this.tipo = tipo;
    }

    public TipoCelda getTipo() {
        return tipo;
    }

    public boolean esMuro() {
        return tipo == TipoCelda.PARED;
    }

    public boolean esTrampa() {
        return tipo == TipoCelda.TRAMPA;
    }

    public boolean esSuelo() {
        return tipo == TipoCelda.SUELO;
    }

    public Personaje getOcupante() {
        return ocupante;
    }

    public void setOcupante(Personaje ocupante) {
        this.ocupante = ocupante;
    }
}