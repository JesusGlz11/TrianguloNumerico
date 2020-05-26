
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesus
 */
public class Triangulonum {
    
    public static void main (String []args) { 
     Scanner sc = new Scanner (System.in) ; 
     
     int num ;
    int cont =0  ;
     System.out.println( "Cual es la altura?" ); 
     num = sc.nextInt() ; 
     
for (int i = 1; i <=num; i++) {
    cont +=2;
        
    for (int j = cont-2 ; j >=i; j--) { 
       System.out.print(j);
    }

    System.out.println("");
}
    }
}

        