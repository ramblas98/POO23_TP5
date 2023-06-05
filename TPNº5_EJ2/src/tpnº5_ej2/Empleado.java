/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpnº5_ej2;

import java.util.Date;


public class Empleado implements Comparable <Empleado>{
    private String nombre;
    private String apellido;
    private Date fnac;
    private long dni;
    private int ingreso;
    
    public Empleado(){}
    
    public Empleado(String nombre, String apellido, Date fnac, long dni, int ingreso){
        this.apellido = apellido;
        this.dni = dni;
        this.fnac = fnac;
        this.ingreso = ingreso;
        this.nombre = nombre;
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getFnac() {
        return fnac;
    }

    public long getDni() {
        return dni;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFnac(Date fnac) {
        this.fnac = fnac;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }
    //Ordenar alfabeticamente por apellidos y nombre
    @Override
    public int compareTo(Empleado otroEmpleado){
        int resultado = this.apellido.compareTo(otroEmpleado.apellido);
        if (resultado == 0 ){
            resultado = this.nombre.compareTo(otroEmpleado.nombre);
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", fnac=" + fnac + ", dni=" + dni + ", ingreso=" + ingreso + '}';
    }
    
    
    
}
