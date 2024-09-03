/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_10_operaciones2;

/**
 *
 * @author invitado
 */
public class Eva1_10_OPERACIONES2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*CONCATENACIÓN CADENAS:
          OPERADOR DE CONCATENACIÓN +
          Mismo símbolo con diferentes
          usos: 
          sobrecarga de operadores
        */
        String nombre = "Michelle";
        String apellido = "Flores";
        String nomCom;
        
        //CONCATENAR:
        nomCom = nombre + " " + apellido;
        
        //imprimir datos
        System.out.println("Nombre del ususario: " + nombre);
        System.out.println("Apellido del ususario: " + apellido);
        System.out.println("Nombre completo del ususario: " + nomCom);
    }
    
}
