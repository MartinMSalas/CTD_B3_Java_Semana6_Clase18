package com.camada2.clase18.clase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Seleccion {
    private String nombre;
    private List<Jugador> jugadores;

    public Seleccion(String nombre) {
        this.nombre = nombre;
        jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador j){
        jugadores.add(j);
        System.out.println("Ha sido incorporado al equipo \n" +  j.toString());
    }

    public List<Jugador> obtenerReservas(){
        List<Jugador> reservas = new ArrayList<>();
        for (Jugador j : jugadores){
            if(j.getNumeroCamiseta()>18){
                reservas.add(j);
            }
        }
        Collections.sort(reservas);
        return reservas;
    }

    public int cantidadJugares(String posicion) throws Exception {
        //"ARQUERO”, “DEFENSOR”, “MEDIOCAMPISTA” o “DELANTERO”
        int cantidad = 0;
        if(posicion.equals("ARQUERO") || posicion.equals("DEFENSOR") || posicion.equals("MEDIOCAMPISTA") || posicion.equals("DELANTERO")){
            for (Jugador jugador : jugadores){
                if (jugador.getPosicion().equals(posicion)) cantidad ++;
            }
        } else {
            throw new Exception("La posicion ingresada no es valida. ERROR!!!!!");
        }
        return cantidad;
    }

}
