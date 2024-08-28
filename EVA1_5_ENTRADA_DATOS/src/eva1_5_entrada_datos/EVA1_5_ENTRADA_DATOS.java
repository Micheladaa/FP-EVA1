/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_5_entrada_datos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_5_ENTRADA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        
        /*CAPTURA DE DATOS DEL TECLADO:
          Scanner --> herramienta (clase)
          Scanner: es un tipo de dato
        */
        Scanner captu; //INCORPORAR LA HERRMANIENTA AL CÓGIGO
        captu = new Scanner(System.in); //CREAMOS LA HERRAMIENTA
        
        //DARLE LA INSTRUCCIÓN AL USUARIO
        System.out.println("Introduce tu nombre completo: ");
        
        //CAPTURAR (Asignar un valor)
        nombre = captu.nextLine();/*CAPTURAMOS TODO EL TEXTO
                                    HASTA PRESIONAR ENTER*/
        //IMPRIMIR 
        System.out.println("<<<<<DATOS CAPTURADOS>>>>>");
        System.out.println("Tu nombre es: " + nombre);
    }
    
}
