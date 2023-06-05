/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpnº5_ej2;

import java.util.Comparator;
import java.util.Date;


public class EdadComparator implements Comparator{
    
    @Override
    public int compare(Object obj1, Object obj2){
        Empleado e1 = (Empleado) obj1;
        Empleado e2 = (Empleado) obj2;
        
        Date fecha1 = e1.getFnac();
        Date fecha2 = e2.getFnac();
        
        return fecha1.compareTo(fecha2);
    }
}
