/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_6_entrada_datos2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva1_6_Entrada_Datos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Nombre;
        String curp;
        int edad;
        double prom;
        
        Scanner captu;
        captu = new Scanner(System.in);
        
        System.out.println("CAPTURA TU NOMBRE COMPLETO: ");
        Nombre = captu.nextLine();
        System.out.println("CAPTURA TU CURP: ");
        curp = captu.nextLine();
        System.out.println("CAPTURA TU EDAD: ");
        edad = captu.nextInt();
        System.out.println("CAPTURA TU PROMEDIO");
        prom = captu.nextDouble();
        
        System.out.println("<<<<<SECCION DE IMPRESION DE DATOS>>>>>");
        System.out.println("TU NOMBRE: " + Nombre);      
        System.out.println("TU CURP: " + curp);
        System.out.println("TU EDAD: " + edad);
        System.out.println("TU PROMEDIO: " + prom);
        
        
    }
    
}
