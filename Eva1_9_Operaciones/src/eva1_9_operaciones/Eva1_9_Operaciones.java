/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_9_operaciones;

/**
 *
 * @author invitado
 */
public class Eva1_9_Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OPERACIONES ARITMETICAS
        int x=10;  //Declaración y asignación
        int y=5;
        //Declaración en la misma linea
        int suma, resta, mult, div, pot, raiz;
        
        
        //SUMA Y RESTA
        suma = x + y;
        System.out.println("LA SUMA DE X + Y ES: ");
        System.out.println(suma);
        resta = x - y;
        System.out.println("LA RESTA DE X - Y ES: ");
        System.out.println(resta);
        
        //MULTIPLICACIÓN
        mult = x * y;
        System.out.println("LA MULTIPLICACIÓN DE X * Y ES: ");
        System.out.println(mult);
        
        //DIVISIÓN
        div = x / y;
        System.out.println("LA DIVISIÓN DE (X) / (Y) ES: ");
        System.out.println(div);
        
        x=5;
        y=2;
        div = x / y;
        System.out.println("LA DIVISIÓN DE (X) / (Y) ES: ");
        System.out.println(div);
        
        //DIVISIÓN CON PUNTO FLOTANTE
        double val1=5, val2=2, resu;
        resu = val1 / val2;
        System.out.println("LA DIVISIÓN DE VAL1(5) / VAL2(2) ES: ");
        System.out.println(resu);
        
     
        
    }
    
}
