package com.ctd.b3.java.clase18.estacion;

import java.util.ArrayList;

public class Empresa extends Exception{
    private String nombre;
    private String ciudad;
    private String pais;
    private ArrayList<Reserva> listaReservas;
    private ArrayList<Estacion> listaEstaciones;

    public Empresa(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        listaReservas = new ArrayList<>();
        listaEstaciones = new ArrayList<>();
    }

    public void agregarReserva(Reserva reserva){
        listaReservas.add(reserva);
        actualizarCantVisitas();


    }
    private void actualizarCantVisitas(){
        for (Reserva reserva: listaReservas
             ) {
            int origen = reserva.getRecorrido()/100;
            int destino = reserva.getRecorrido()%100;
            if (origen <= destino){
                for(int i= origen;i<= destino;i++ ){
                    listaEstaciones.get(i).visitarEstacion();
                }
            }else {
                for(int i= destino;i<= origen;i-- ){
                    listaEstaciones.get(i).visitarEstacion();
                }
            }

        }
    }

    public void cambiarPrecioBase(double precio){
        for (Reserva reserva:listaReservas
             ) {
            reserva.setPrecioBase(precio);
        }
    }


    public void mostrarReservas(){
        for (Reserva reserva: listaReservas
             ) {
            reserva.toString();
        }
    }
    
    public int cantVecesRecorrida(Estacion estacion) throws RuntimeException{
        if(listaEstaciones.contains(estacion)){

        return estacion.getCantVisitas();
        }else {
            throw new RuntimeException("La estacion solicitada: " + estacion + " no se encuentra en la lista de estaciones" );
        }
    }

    // Este metodo antes de agregar la estacion chequea q no exista, ademas despues de agregarla modifica
    // los recorridos y el preciototal de cada reserva
    public void agregarEstacion(Estacion estacion, int ubicacion){
        // Es necesario chequear que la estacion no este agregada
        if(!listaEstaciones.contains(estacion)) {
            // creamos listas auxiliares para guardar los recorridos y el nombre de los destinos y origenes
            //ArrayList<Integer> listaAuxiliarRecorrido = new ArrayList<>() ;
            ArrayList<String> listaAuxiliarRecorridoNombreOrigenes = new ArrayList<>() ;
            ArrayList<String> listaAuxiliarRecorridoNombreDestinos = new ArrayList<>() ;


            for (Reserva reserva:listaReservas
                 ) {
                int auxiliar = reserva.getRecorrido();
                //listaAuxiliarRecorrido.add(auxiliar);
                String origen = listaEstaciones.get((int) auxiliar / 100).getNombre();
                listaAuxiliarRecorridoNombreOrigenes.add(origen);

                String destino = listaEstaciones.get((int) auxiliar % 100).getNombre();
                listaAuxiliarRecorridoNombreDestinos.add(destino);

            }
            listaEstaciones.add(ubicacion, estacion);
            for (int i=0; i<listaReservas.size();i++){
                listaReservas.get(i).actualizarRecorrido(listaEstaciones.indexOf(listaAuxiliarRecorridoNombreOrigenes.get(i)),listaEstaciones.indexOf(listaAuxiliarRecorridoNombreDestinos.get(i)));
            }

        }


    }

}
