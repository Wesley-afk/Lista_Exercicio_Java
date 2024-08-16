/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_15;

/**
 *
 * @author w.rocha
 */
import java.util.Scanner;
public class Projeto_12_15 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
         int num = 0;
          int resultado = 0;
         
         System.out.println("Digite um número");
          num = ler.nextInt();
          
          for(int c = num; c >= 1; c--){
            System.out.println(num + " * " + c + " = " + (resultado = num * c));
    }             
  }
}
