/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_3;

/**
 *
 * @author w.rocha
 */
import java.util.Scanner;
public class Projeto_12_3 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int modalidade = 0;
        int numUm = 0;
        int numDois = 0;
     
        System.out.println("Você deseja fazer contas de:");
         System.out.println("1 - Adicao");
          System.out.println("2 - Subtracao");
           System.out.println("3 - Multiplicacao");
            System.out.println("4 - Divisao");
             modalidade = ler.nextInt();
       
      if(modalidade == 1){       
       System.out.println("Digite os algarismos para a adicao.");
        numUm = ler.nextInt();
         numDois = ler.nextInt();
          System.out.println("Resultado: " + (numUm + numDois));
        }
      
      else if(modalidade == 2){
       System.out.println("Digite os algarismos para a subtracao.");
        numUm = ler.nextInt();
         numDois = ler.nextInt();
          System.out.println("Resultado: " + (numUm - numDois));
      }
      
      else if(modalidade == 3){
       System.out.println("Digite os algarismos para a mulplicao.");
        numUm = ler.nextInt();
         numDois = ler.nextInt();
          System.out.println("Resultado: " +(numUm * numDois));
       }
      
      else if(modalidade == 4){
       System.out.println("Digite os algarismos para a divisao.");
        numUm = ler.nextInt();
         numDois = ler.nextInt();
          System.out.println("Resultado: " + (numUm / numDois));
      }
    }
}
