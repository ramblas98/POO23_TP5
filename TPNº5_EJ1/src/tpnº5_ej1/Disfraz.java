/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpnº5_ej1;


public class Disfraz implements Rentable{
    private String personaje;
    private char taller;
    private int dias;
    private double precio;
    
    public Disfraz(){}
    
    public Disfraz(String personaje, char taller, int dias, double precio){
        this.dias = dias;
        this.personaje = personaje;
        this.precio = precio;
        this.taller = taller;
    }
    
    public String getPersonaje(){ return personaje; }
    public char getTaller(){ return taller; }
    public int getDias(){ return dias; }
    public double getPrecio(){ return precio; }
    
    public void setPersonaje(String personaje){this.personaje = personaje;}
    public void setTaller(char taller){this.taller = taller;}
    public void setDias(int dias){this.dias = dias;}
    public void setPrecio(double precio){this.precio = precio;}
    
    @Override
    public void alquilar(int periodo){
        System.out.println("Disfraz alquilado por " + periodo + " dias");
    }
        
}
