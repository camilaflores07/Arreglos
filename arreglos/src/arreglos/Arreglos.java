/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 50494
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ejercicios arreglos
         Scanner entrada = new Scanner(System.in);
        int nentrada;
        
        nentrada = Integer.parseInt(JOptionPane.showInputDialog("favor ingrsar la cantidad de enetradas"));
        char[] letras= new char[nentrada];  
        
        System.out.println("Favor ingresar los caracteres: ");
        
        for (int i = 0; i < nentrada; i++) {
            System.out.println((i+1)+" " +"Favor ingresar el caracter");
            letras[i]= entrada.next().charAt(0);
        }
        System.out.println("Los caracteres ingresados son: \n ");
        for (int i = 0; i < nentrada; i++) {
            System.out.println(letras[i]);
            
        }
        
        
        
        
        
        
     //// example   
      /* int [] numeros = {1, 4, 6, 7, 8};
        System.out.println(numeros[3]);*/
    }
    
                
}
