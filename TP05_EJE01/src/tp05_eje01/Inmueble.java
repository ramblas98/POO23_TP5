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
public class Inmueble implements  Rentable,Comparable{
    private String direccion;
    private String tipo;
    private double valor;
    private int anio;

    public Inmueble() {
    }

    public Inmueble(String direccion, String tipo, double valor, int anio) {
        this.direccion = direccion;
        this.tipo = tipo;
        this.valor = valor;
        this.anio = anio;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public int getAnio() {
        return anio;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    
    //metodo

    @Override
    public String toString() {
        return "Inmueble{" + "direccion=" + direccion + ", tipo=" + tipo + ", valor=" + valor + ", anio=" + anio + '}';
    }
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
        Inmueble i=(Inmueble) o;
        
        return this.direccion.compareTo(i.getDireccion());
    }
    
    
}
