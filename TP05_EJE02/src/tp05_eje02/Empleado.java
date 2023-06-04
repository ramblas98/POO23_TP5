/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp05_eje02;

/**
 *
 * @author Sans
 */
public class Empleado implements Comparable{
    private String nombre;
    private String apellido;
    private int dni;
    private int dia;
    private int mes;
    private int anio;
    private int anioingreso;
    
    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int dni, int dia, int mes, int anio, int anioingreso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.anioingreso = anioingreso;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public int getAnioingreso() {
        return anioingreso;
    }
    
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setAnioingreso(int anioingreso) {
        this.anioingreso = anioingreso;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", dia=" + dia + ", mes=" + mes + ", anio=" + anio + ", anioingreso=" + anioingreso + '}';
    }
    
    

    //metodo

    @Override
    public int compareTo(Object o) {
        Empleado e=(Empleado) o;
        return this.nombre.compareTo(e.getNombre());
    }
    
}
