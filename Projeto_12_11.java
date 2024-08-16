/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_11;

/**
 *
 * @author wpass
 */
import java.util.Scanner;
public class Projeto_12_11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         int temperatura = 0;
          int opcao = 0;
           double resultado = 0;
         
        System.out.println("1 - Celcius \n 2 - Fahrenheit");
         opcao = ler.nextInt();
         
         if(opcao == 1){
          System.out.println("Digite a temperatura em inteiro.");
           temperatura = ler.nextInt();
            resultado = temperatura * 1.8 + 32;        
             System.out.println("A temperatura em fahrenheit é: " + resultado);
         } 
         
         else if(opcao == 2){
          System.out.println("Digite a temperatura em inteiro.");
           temperatura = ler.nextInt();
             resultado = (temperatura - 32) / 1.8;        
              System.out.println("A temperatura em celci é: " + resultado);  
         }
        
    }
}
