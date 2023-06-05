/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpnº5_ej2;

import java.util.Arrays;
import java.util.Date;

public class TPNº5_EJ2 {

    
    public static void main(String[] args) {
        
        Empleado lista[] = new Empleado[4];
        
        lista[0] = new Empleado("Jontan", "Cossio", new Date(2001,6,21), 43548653, 2005);
        lista[1] = new Empleado("Javier", "Carrizo", new Date(1990,5,33),40213321,2001);
        lista[2] = new Empleado("López", "Juan", new Date(1980, 5, 15), 41242121, 2005);
        lista[3] = new Empleado("González", "María", new Date(1975, 10, 10), 39231312, 2002);
        
        Arrays.sort(lista);
        System.out.println("Lista ordenada alfabeticamente: ");
        System.out.println(lista.toString());
        
        Arrays.sort(lista, new EdadComparator());
        System.out.println("Lista ordenada por edad");
        System.out.println(lista.toString());
        
        Arrays.sort(lista, new AntiguedadComparator());
        System.out.println("Lista ordenada por antiguedad:");
        System.out.println(lista.toString());
    }
    
}
