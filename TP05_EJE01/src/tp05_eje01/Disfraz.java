/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp05_eje01;

/**
 *
 * @author Sans
 */
public class Disfraz implements Rentable,Comparable{
    private String personaje;
    private char talle;
    private int dias;
    private double precio;

    public Disfraz() {
    }

    public Disfraz(String personaje, char talle, int dias, double precio) {
        this.personaje = personaje;
        this.talle = talle;
        this.dias = dias;
        this.precio = precio;
    }

    public String getPersonaje() {
        return personaje;
    }

    public char getTalle() {
        return talle;
    }

    public int getDias() {
        return dias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public void setTalle(char talle) {
        this.talle = talle;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Disfraz{" + "personaje=" + personaje + ", talle=" + talle + ", dias=" + dias + ", precio=" + precio + '}';
    }
    
    //Metodo
    @Override
    public void alquiler(int periodo){
        
    }
    @Override
    public boolean alquilado(){
        return true;
    }
    @Override
    public void desocupar(){
        System.out.println("Se desocupo");
    }

    @Override
    public int compareTo(Object o) {
        Disfraz l=(Disfraz) o;
        if(this.precio==l.getPrecio()) return 0;
        else if(this.precio<l.getPrecio()) return -1;
        else return 1;
    }
    
}
