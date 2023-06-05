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
public class Animal extends Identificador implements Hablador,Relaciones{

    public Animal() {
    }

    public Animal(String nombre, String direccion) {
        super(nombre, direccion);
    }
    
    
    
   @Override 
    public void hablar(){
        System.out.println("Soy un Animal");
    }
    @Override
    public boolean esMayor(Object o){
        return true;
    }
    @Override
    public boolean esMenor(Object o){
        return true;
    }
    @Override
    public boolean esIguaL(Object o){
        return true;
    }
    @Override
    public String darnombre(){
        return super.getNombre();
    }
}
