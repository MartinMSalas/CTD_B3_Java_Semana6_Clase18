package com.camada2.clase18.clase;

public class Jugador implements Comparable<Jugador>{
    private String apellido;
    private String posicion;
    private int numeroCamiseta;

    public Jugador(String apellido, String posicion, int numeroCamiseta) {
        this.apellido = apellido;
        this.posicion = posicion;
        this.numeroCamiseta = numeroCamiseta;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public int compareTo(Jugador o) {
        return Integer.compare(numeroCamiseta, o.numeroCamiseta);
    }

    @Override
    public String toString(){
        return "Jugador: " + apellido + "\n" +
                "Numeros de camiseta: " + numeroCamiseta + "\n" +
                "Posicion: " + posicion;
    }
}
