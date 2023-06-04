/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp05_eje01;

import java.util.Arrays;

/**
 *
 * @author Sans
 */
public class TP05_EJE01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inmueble lista[]=new Inmueble[4];
        lista[0]=new Inmueble("Lopez i Plane","1 plaza",23000,2010);
        lista[1]=new Inmueble("Alavarado","2 plaza",45000,1000);
        lista[2]=new Inmueble("Fassio","1 plaza",1000,4000);
        lista[3]=new Inmueble("Cordoba","3 plaza",45000,1344);
        Disfraz l[]=new Disfraz[3];
        l[0]=new Disfraz("Pluto",'C',12,300.56);
        l[1]=new Disfraz("Mini",'L',430,100);
        l[2]=new Disfraz("Mickey",'M',0,450);
        System.out.println("Inmueble");
        for(int i=0;i<4;i++){
            System.out.println(lista[i]);
        }
        Arrays.sort(lista);
            System.out.println("Ordenado");
        for(int i=0;i<4;i++){
            System.out.println(lista[i]);
        }
        System.out.println("--------------------------------------");
        System.out.println("Disfraz");
        for(int i=0;i<3;i++){
            System.out.println(l[i]);
        }
        Arrays.sort(l);
        System.out.println("Ordenado");
        for(int i=0;i<3;i++){
            System.out.println(l[i]);
        }
    }
    
}
