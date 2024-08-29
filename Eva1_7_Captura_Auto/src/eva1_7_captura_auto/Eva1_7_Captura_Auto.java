/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_7_captura_auto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva1_7_Captura_Auto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String marca;
        String modelo;
        int year; 
        double precio;
        
        Scanner captu;
        captu = new Scanner(System.in);
        
        System.out.println("CAPTURA LA MARCA: ");
        marca = captu.nextLine();
        System.out.println("CAPTURA EL MODELO: ");
        modelo = captu.nextLine();
        System.out.println("CAPTURA EL AÑO: ");
        year = captu.nextInt();
        System.out.println("CAPTURA EL PRECIO");
        precio = captu.nextDouble();
        
        System.out.println("<<<<<SECCION DE IMPRESION DE DATOS>>>>>");
        System.out.println("LA MARCA ES: " + marca);      
        System.out.println("EL MODELO ES: " + modelo);
        System.out.println("EL AÑO ES: " + year);
        System.out.println("EL PRECIO ES: $" + precio);
    }
    
}
