/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_21_mesesaño;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva1_21_MesesAño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mes;
        Scanner captu = new Scanner (System.in);
        
         System.out.println("CAPTURA UN NUMERO ENTRE EL 1 - 12: ");
         mes = captu.nextInt();
         captu.nextLine();
         
         if(mes == 1){
             System.out.println("ENERO ");
         }else if(mes == 2){
             System.out.println("FEBRERO ");
         }else if(mes == 3){
             System.out.println("MARZO ");
         }else if(mes == 4){
             System.out.println("ABRIL ");
         }else if(mes == 5){
             System.out.println("MAYO ");
         }else if(mes == 6){
             System.out.println("JUNIO ");
         }else if(mes == 7){
             System.out.println("JULIO ");
         }else if(mes == 8){
             System.out.println("AGOSTO ");
         }else if(mes == 9){
             System.out.println("SEPTIEMBRE ");
         }else if(mes == 10){
             System.out.println("OCTUBRE ");
         }else if(mes == 11){
             System.out.println("NOVIEMBRE ");
         }else if(mes == 12){
             System.out.println("DICIEMBRE ");
         }else{
             System.out.println("NUMERO INVALIDO ");
         }
    }
    
}
