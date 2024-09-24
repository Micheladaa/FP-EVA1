/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_18_rangos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva1_18_Rangos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cal;
        Scanner captu = new Scanner (System.in);
        
        System.out.println("INGRESA LA CALIFICACION: ");
        cal = captu.nextInt();
        
        if(cal >= 0 && cal <= 100 ){
            System.out.println("CALIFICACION VALIDA ");
        }
        else {
            System.out.println("CALIFICACION NO VALIDA ");
        }
    }
    
}
