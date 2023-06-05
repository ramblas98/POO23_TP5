/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp05_eje03;
import java.util.Arrays;
/**
 *
 * @author Sans
 */
public class TP05_EJE03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //esto  es del ejercicio 3
     /*   Perro a=new Perro();
        Gato b=new Gato();
        Persona p=new Persona("Moya",41986468);
        a.hablar();
        b.hablar();
        p.hablar();
        //empieza el ejercicio 4
       */
     Perro a=new Perro("Pichicho","Alvarado 241");
     Gato b=new Gato("Manchas","Egues 343");
     Programador c=new Programador("Moya",41986468,"Nicolas","20 de febrero 155");
     Hablador l[]=new Hablador[3];
     l[0]=a;
     l[1]=b;
     l[2]=c;
     for(int i=0;i<3;i++){
         l[i].hablar();
     }
     System.out.println("Lista ordenada por nombre");
     Arrays.sort(l,new CompararRelacionesNombre());
     for(int i=0;i<3;i++){
         l[i].hablar();
     }
    }
    
}
