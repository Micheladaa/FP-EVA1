/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_12_formulas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva1_12_Formulas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double d, vo, a, t;
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("INGRESA LA VELOCIDAD INICIAL: ");
        vo = captu.nextDouble();
        System.out.println("INGRESA LA ACELERACIÓN: ");
        a = captu.nextDouble();
        System.out.println("INGRESA EL TIEMPO: ");
        t = captu.nextDouble();
        
        d = (vo*t) + (a*t*t)/2.0;
        
        System.out.println("LA DISTANCIA ES: " + d);
        
      
    }
    
}
