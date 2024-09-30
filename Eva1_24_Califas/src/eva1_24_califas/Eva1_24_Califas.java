/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_24_califas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva1_24_Califas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cal;
        Scanner captu = new Scanner (System.in);
        
         System.out.println("CAPTURA LA CALIFICACION: ");
         cal = captu.nextInt();
         captu.nextLine();
         
         if(cal >=90 && cal <= 100){
             System.out.println("A");
         }else if(cal >=80 && cal <=89){
             System.out.println("B");
         }else if(cal >=70 && cal <= 79){
             System.out.println("C");
         }else if(cal >=60 && cal <= 69){
             System.out.println("D");
         }else if(cal >=0 && cal <= 59){
             System.out.println("F");
         }else{
             System.out.println("NUMERO INVALIDO ");
         }
    }
    
}
