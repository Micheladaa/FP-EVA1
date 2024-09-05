/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_11_conversion;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva1_11_Conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double f, c, k;
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("INGRESA LOS GRADOS FAHRENHEIT: ");
        f = captu.nextDouble();
        c = (f-32)/1.8;
        
        System.out.println("LOS GRADOS EN C°: " + c);
        
        System.out.println("INGRESA LOS GRADOS CENTIGRADOS: ");
        c = captu.nextDouble();
        f = c*1.8+32;
        
        System.out.println("LOS GRADOS EN F°: " + f);
        
        System.out.println("INGRESA LOS GRADOS KELVIN: ");
        k = captu.nextDouble();
        c = k-273.15;
        
        System.out.println("LOS GRADOS EN C°: " + c);
        
       
    }
    
}
