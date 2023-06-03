/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpnº5_ej1;


public class Inmueble implements Rentable{
    private String direccion;
    private String tipo;
    private double valor;
    private int anios;
    
    public Inmueble(){}
    
    public Inmueble(String direccion, String tipo, double valor, int anios){
        this.anios = anios;
        this.direccion = direccion;
        this.tipo = tipo;
        this.valor = valor;
    }
    
    public String getDireccion() { return direccion; }
    public String getTipo(){ return tipo; }
    public double getValor() { return valor; }
    public int getAnios() { return anios; }
    
    public void setDireccion(String direccion){ this.direccion = direccion;}
    public void setTipo(String tipo) { this.tipo = tipo;}
    public void setValor(double valor) { this.valor = valor;}
    public void setAnios(int anios) { this.anios = anios;}

    @Override
    public void alquilar(int periodo) {
        this.anios = periodo;
        System.out.println("Inmueble alquilado por "+periodo+" anios");
    }
    
    @Override
    public boolean alquilado(){
        if (this.anios > 0) return true;
        else return false;
    }
    
    @Override
    public void desocupar(){
        this.anios = 0;
        System.out.println("Inmueble desocupado");
    }
    
    
 }
