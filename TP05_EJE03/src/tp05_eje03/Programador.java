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
public class Programador extends Persona{

    public Programador() {
    }

    public Programador(String apellido, int dni) {
        super(apellido, dni);
    }

    public Programador(String apellido, int dni, String nombre, String direccion) {
        super(apellido, dni, nombre, direccion);
    }
    //metodo
    @Override
    public void hablar(){
        super.hablar();
        System.out.print(" y soy programador");
        System.out.println();
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
