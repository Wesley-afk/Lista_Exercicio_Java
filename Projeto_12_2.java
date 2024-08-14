/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_2;

/**
 *
 * @author w.rocha
 */
import java.util.Scanner;
 import java.util.Random;
public class Projeto_12_2 {
    
    public static void main(String[] args) {        
       Scanner ler = new Scanner(System.in);
       Random sorteio = new Random();
       int Num_sorteado = sorteio.nextInt(100) + 1;
       int resposta = 0;
       
      System.out.println("Foi sortedo um número aleatório entre 1 e 100.\n Adivinhe!");
      
         while(resposta != Num_sorteado){
             System.out.println("Digite um número.");
               resposta = ler.nextInt();
               
                if(resposta < Num_sorteado){
                    System.out.println("O número sorteado é maior!");
                }
                else if(resposta > Num_sorteado){
                    System.out.println("O número sorteado é menor!");
                }
         }
          if(resposta == Num_sorteado){
              System.out.println("Exato!");
          }
    }
}
