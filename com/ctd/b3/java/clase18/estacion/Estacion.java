package com.ctd.b3.java.clase18.estacion;

public class Estacion {
    private String nombre;
    private String ciudad;
    private String pais;

    private int cantVisitas=0;

    public Estacion(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public void visitarEstacion(){
        cantVisitas++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantVisitas() {
        return cantVisitas;
    }

    @Override
    public String toString() {
        return "Estacion " +nombre +'\n' +
                "Mi ubicacion es en la ciudad de "+ciudad +
                "en el pais de " + pais + '\n' +
                "fuy visitada: " + cantVisitas + " veces";
    }
}
