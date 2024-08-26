/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_2_variables2;

/**
 *
 * @author invitado
 */
public class Eva1_2_Variables2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String marca;
        String modelo;
        int year; //La "ñ" en otros lenguajes no es aceptada
        double precio;
        
        marca = "NISSAN" ;
        modelo = "GTR" ;
        year = 2008 ;
        precio = 1000000.1 ;
        
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(year);
        System.out.println("$" + precio);
    }
    
}
