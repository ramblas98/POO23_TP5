/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp05_eje02;

import java.util.Comparator;

/**
 *
 * @author Sans
 */
public class ComparaEmpleadoEdad implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Empleado e=(Empleado) o1;
        Empleado e1=(Empleado) o2;
        if(e.getDni()==e1.getDni())return 0;
        else if(e.getDni()<e1.getDni()) return -1;
        else return 1;
    }
    
}
