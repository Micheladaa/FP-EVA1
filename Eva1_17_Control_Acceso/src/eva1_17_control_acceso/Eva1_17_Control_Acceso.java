/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_17_control_acceso;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva1_17_Control_Acceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usu, pwd;
        Scanner captu = new Scanner (System.in);
        
        System.out.println("INGRESA EL USUARIO: ");
        usu = captu.nextLine();
        
        System.out.println("INGRESA LA CONTRASEÑA: ");
        pwd = captu.nextLine();
        
         if (usu.equals("Admin") && pwd.equals("1234")){
            System.out.println("ACCESO AL SISTEMA");
            
        }else {
            System.out.println("ACCESO DENEGADO");
        }
    }
    
}
