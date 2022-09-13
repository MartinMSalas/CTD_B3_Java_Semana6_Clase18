package com.camada2.clase18.clase;



public class Main {
    public static void main(String[] args) {
        //"ARQUERO”, “DEFENSOR”, “MEDIOCAMPISTA” o “DELANTERO”
        Jugador j1 = new Jugador("Messi", "DELANTERO", 10);
        Jugador j2 = new Jugador("Martinez", "ARQUERO", 12);
        Jugador j3 = new Jugador("De Paul", "DELANTERO", 11);
        Jugador j4 = new Jugador("Di Maria", "DELANTERO", 7);
        Jugador j5 = new Jugador("Otamendi", "DEFENSOR", 20);

        Seleccion sel = new Seleccion("Argentina");

        sel.agregarJugador(j1);
        sel.agregarJugador(j2);
        sel.agregarJugador(j3);
        sel.agregarJugador(j4);
        sel.agregarJugador(j5);
        System.out.println("----------------------------------");
        System.out.println(sel.obtenerReservas());
        System.out.println("----------------------------------");

        try{
            System.out.println(sel.cantidadJugares("DELANTERO"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(sel.cantidadJugares("DT"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
