/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_20_if_else_aninado;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva1_20_If_Else_Aninado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia;
        Scanner captu = new Scanner (System.in);
        
         System.out.println("CAPTURA UN NUMERO ENTRE EL 1 - 7: ");
         dia = captu.nextInt();
         captu.nextLine();
         
         if(dia == 1){
             System.out.println("DOMINGO ");
         }else if(dia == 2){
             System.out.println("LUNES ");
         }else if(dia == 3){
             System.out.println("MARTES ");
         }else if(dia == 4){
             System.out.println("MIERCOLES ");
         }else if(dia == 5){
             System.out.println("JUEVES ");
         }else if(dia == 6){
             System.out.println("VIERNES ");
         }else if(dia == 7){
             System.out.println("SABADO ");
         }else{
             System.out.println("NUMERO INVALIDO ");
         }
             
         
    }
    
}
