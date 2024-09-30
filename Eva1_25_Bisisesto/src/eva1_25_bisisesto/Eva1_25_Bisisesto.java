/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_25_bisisesto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva1_25_Bisisesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int year;
        
        Scanner captu = new Scanner (System.in);
        
        System.out.println("CAPTURA EL AÑO: ");
        year = captu.nextInt();
        
        if((year % 4 == 0 || year % 100 < 0) || year % 400 == 0 ){
             System.out.println("AÑO BISISESTO ");
        }else {
             System.out.println("NO ES AÑO BISIESTO ");
        }
    }
    
}
