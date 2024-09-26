/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_22_switch;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva1_22_Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia;
        Scanner captu = new Scanner (System.in);
        
         System.out.println("CAPTURA UN NUMERO ENTRE EL 1 - 7: ");
         dia = captu.nextInt();
         captu.nextLine();
         
         switch(dia){
             case 1: 
                 System.out.println("DOMINGO");
                 break;
             case 2: 
                 System.out.println("LUNES");
                 break;
             case 3: 
                 System.out.println("MARTES");
                 break;
             case 4: 
                 System.out.println("MIERCOLES");
                 break;
             case 5: 
                 System.out.println("JUEVES");
                 break;
             case 6: 
                 System.out.println("VIERNES");
                 break;
             case 7: 
                 System.out.println("SABADO");
                 break;
             default:
                 System.out.println("NUMERO NO VALIDO");
         }
    }
    
}
