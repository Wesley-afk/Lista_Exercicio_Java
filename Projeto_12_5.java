/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_5;

/**
 *
 * @author w.rocha
 */
import java.util.Scanner;
public class Projeto_12_5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         int num = 0;
        
         System.out.println("Digite um número para ver a tabuada do 1 até 10");
          num = ler.nextInt();
          
           for(int x = 1; x < 11; x++){
               System.out.println(num + " x " + x + " = " + (num * x));
           }
    }
}
