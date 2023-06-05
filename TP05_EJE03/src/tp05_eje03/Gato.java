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
public class Gato extends Animal{

    public Gato() {
    }

    public Gato(String nombre, String direccion) {
        super(nombre, direccion);
    }
    
    
    
    
    @Override
    public void hablar(){
        System.out.println("Miau");
    }
    @Override
    public boolean esMayor(Object o){
        Hablador a=(Hablador) o;
        if(this.darnombre().compareTo(a.darnombre())>0)return true;
        else return false;
    }
    @Override
    public boolean esMenor(Object o){
        Hablador a=(Hablador) o;
        if(this.darnombre().compareTo(a.darnombre())<0)return true;
        else return false;
    }
    @Override
    public boolean esIguaL(Object o){
        Hablador a=(Hablador) o;
        if(this.darnombre().compareTo(a.darnombre())==0)return true;
        else return false;
    }
    
    
}
