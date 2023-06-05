/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp05_eje03;

import java.util.Comparator;

/**
 *
 * @author Sans
 */
public class CompararRelacionesNombre implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Relaciones h1=(Relaciones) o1;
        Relaciones h2=(Relaciones) o2;
        if(h1.esIguaL(h2)==true)return 0;
        else if(h1.esMayor(h2)==true)return 1;
        else return -1;
    }
    
}
