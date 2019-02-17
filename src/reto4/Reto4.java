/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4;

import java.util.Scanner;

/**
 *
 * @author Ulises
 */
public class Reto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char opcion;
        double costo_boleto = 0.0;
        do{
            System.out.println("Indique tipo de boleto");
            opcion = sc.next().charAt(0);
            switch(opcion){
                case 'a':
                case 'A':
                    costo_boleto = 100.00;
                    break;
                case 'b':
                case 'B':
                    costo_boleto = 70.00;
                    break;
                case 'i':
                case 'I':
                    costo_boleto = 50.00;
                    break;
                case 'n'    
                case 'N':
                    costo_boleto = 70.00;
                    break;
                default:
                    System.out.println("Opcion no disponible.");
                    break;
            }
            System.out.println("Costo del boleto es: " + costo_boleto);
            System.out.println("Otro boleto (s/n?");
            opcion = sc.next().charAt(0);
            
            
        }while(opcion != 'n');           
        
    }
    
}
