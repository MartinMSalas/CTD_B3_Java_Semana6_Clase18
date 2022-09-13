package com.ctd.b3.java.clase18.estacion;

public class Reserva {
    private double precioBase=50;
    private int codigo;
    // recorrido es un codigo de 4 cifras 2 para la estacion origen 2 para la estacion destino
    private int recorrido;
    private int cantPasajeros;
    private double precioTotal;

    public Reserva( int codigo, int origen,int destino, int cantPasajeros) {

        this.codigo = codigo;
        recorrido = (int) Math.sqrt(Math.pow((destino-origen),2));
        precioTotal =  calcularPrecioTotal();
        this.cantPasajeros = cantPasajeros;
    }

    public void actualizarRecorridoPrecioPasajeros(int origen, int destino, int cantPasajeros, double precioBase){
        this.precioBase = precioBase;
        this.cantPasajeros = cantPasajeros;
        recorrido = (int) Math.sqrt(Math.pow((destino-origen),2));
        precioTotal =  calcularPrecioTotal();
    }
    public void actualizarRecorridoPrecio(int origen, int destino, double precioBase){
        this.precioBase = precioBase;
        recorrido = (int) Math.sqrt(Math.pow((destino-origen),2));
        precioTotal =  calcularPrecioTotal();
    }
    private double calcularPrecioTotal(){
        return recorrido*cantPasajeros*precioBase;
    }
    public void actualizarRecorrido(int origen, int destino){
        recorrido = (int) Math.sqrt(Math.pow((destino-origen),2));
        precioTotal =  calcularPrecioTotal();
    }


    public int getRecorrido() {
        return recorrido;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
        precioTotal=   recorrido*cantPasajeros*precioBase;
    }

    @Override
    public String toString() {
        return "Reserva " + "\n" +
                "Mi codigo de reserva es: " + codigo + "\n" +
                "El precio base por pasajero por estacion es: " + "\n" +
                "Voy a recorrer: " + recorrido + " estaciones" +  "\n" +
                "Voy a trasladar: " + cantPasajeros + " pasajeros" + "\n" +
                "Mi precioTotal es: " + precioTotal;
    }
}
