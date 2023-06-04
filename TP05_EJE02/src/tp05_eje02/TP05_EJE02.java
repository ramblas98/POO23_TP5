/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp05_eje02;

import java.util.Arrays;

/**
 *
 * @author Sans
 */
public class TP05_EJE02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado l[]=new Empleado[3];
        l[0]=new Empleado("Nicolas","Moya",41986468,7,6,99,1999);
        l[1]=new Empleado("Federico","Moya",39754234,24,3,96,2014);
        l[2]=new Empleado("Leandro","Moya",37956321,25,9,93,2010);
        for(int i=0;i<3;i++){
            System.out.println(l[i]);
        }
        System.out.println("--------------------------------------------");
        System.out.println("Ordenado Por nombre con Comparable");
        Arrays.sort(l);
        for(int i=0;i<3;i++){
            System.out.println(l[i]);
        }
        System.out.println("--------------------------------------------");
        System.out.println("Ordenado Por Edad con Compator");
        Arrays.sort(l,new ComparaEmpleadoEdad());
        for(int i=0;i<3;i++){
            System.out.println(l[i]);
        }
        System.out.println("--------------------------------------------");
        System.out.println("Ordenado Por Antiguedad con Compator");
        Arrays.sort(l,new ComparaEmpleadoAnioIngreso());
        for(int i=0;i<3;i++){
            System.out.println(l[i]);
        }
        
        
        
    }
    
}
