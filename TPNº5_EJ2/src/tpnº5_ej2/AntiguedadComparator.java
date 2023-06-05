/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpnº5_ej2;

import java.util.Comparator;


public class AntiguedadComparator implements Comparator{
    
    @Override 
    public int compare(Object obj1, Object obj2){
        Empleado e1 = (Empleado) obj1;
        Empleado e2 = (Empleado) obj2;
        
       if (e1.getIngreso() == e2.getIngreso())
           return 0;
       else if (e1.getIngreso() < e2.getIngreso())
           return -1;
       else return 1;
    }
}
