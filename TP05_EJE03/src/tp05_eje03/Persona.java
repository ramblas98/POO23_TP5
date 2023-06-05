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
public class Persona extends Identificador implements Hablador,Relaciones{
    private String apellido;
    private int dni;

    public Persona() {
    }

    public Persona(String apellido, int dni) {
        this.apellido = apellido;
        this.dni = dni;
    }

    public Persona(String apellido, int dni, String nombre, String direccion) {
        super(nombre, direccion);
        this.apellido = apellido;
        this.dni = dni;
    }

    

    
    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +"nombre="+super.getNombre()+ ",apellido=" + apellido + ", dni=" + dni + '}';
    }


    

    //Metodo
    
    @Override
    public void hablar(){
        System.out.print("Hola me llamo : "+super.getNombre()+" "+this.apellido+" mi dni es "+this.dni+" Mi direccion es : "+super.getDireccion());
    }
 /*   
    @Override
    public boolean esMayor(Object o){
        Persona p=(Persona) o;
        if(this.getNombre().compareTo(p.getNombre())>0)return true;
        else return false;
    }
    @Override
    public boolean esMenor(Object o){
        Persona p=(Persona) o;
        if(this.getNombre().compareTo(p.getNombre())<0)return true;
        else return false;
    }
    
    @Override
    public boolean esIguaL(Object o){
        return this.getNombre().equals(((Persona)o).getNombre());
    }
   */
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
}
