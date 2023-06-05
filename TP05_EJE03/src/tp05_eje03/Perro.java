/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp05_eje03;

/**
 *
 * @author Sans
 */
public class Perro extends Animal{

    public Perro() {
    }

    public Perro(String nombre, String direccion) {
        super(nombre, direccion);
    }
    
    
    
   @Override 
    public void hablar(){
        System.out.println("WOFF");
    }

    @Override
    public boolean esMayor(Object o){
        Perro a=(Perro) o;
        if(this.getNombre().compareTo(a.getNombre())>0)return true;
        else return false;
    }
    @Override
    public boolean esMenor(Object o){
        Perro a=(Perro) o;
        if(this.getNombre().compareTo(a.getNombre())<0)return true;
        else return false;
    }
    @Override
    public boolean esIguaL(Object o){
        Perro a=(Perro) o;
        if(this.getNombre().compareTo(a.getNombre())==0)return true;
        else return false;
    }
    
}
