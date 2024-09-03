/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_8_pelicula;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva1_8_Pelicula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String genero;
        int Dura; 
        String repar;
        String clasi;
        
        Scanner captu;
        captu = new Scanner(System.in);
        
        System.out.println("CAPTURA EL NOMBRE DE LA PELICULA: ");
        nombre = captu.nextLine();
        System.out.println("CAPTURA EL GENERO: ");
        genero = captu.nextLine();
        System.out.println("CAPTURA EL REPARTO: ");
        repar = captu.nextLine();
        System.out.println("CAPTURA LA CLASIFICACIÓN: ");
        clasi = captu.nextLine();
        System.out.println("CAPTURA LA DURACIÓN: ");
        Dura = captu.nextInt();
               captu.nextLine(); /*EN CASO DE QUE TENGAMOS PROBLEMAS 
                                   DESPUES DE CAPTURAR ENTEROS*/
        
        System.out.println("<<<<<SECCION DE IMPRESION DE DATOS>>>>>");
        System.out.println("LA PELICULA ES: " + nombre);      
        System.out.println("EL GENERO ES: " + genero);
        System.out.println("EL REPARTO ES: " + repar);
        System.out.println("LA CLASIFICACION ES: " + clasi);
        System.out.println("LA DURACION ES: " + Dura + "seg");
    }
    
}
