/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_7;

import java.util.Scanner;

/**
 *
 * @author wpass
 */
public class Projeto_12_7 {

    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         int num = 0;
         
         System.out.println("Digite um número");
          num = ler.nextInt();
          
          int[] par = new int[num];
          int[] impar = new int[num];
          int contador_1 = 0;
          int contador_2 = 0;
          
          for(int c = 0; c < num; c++){
              if(c % 2 == 0){
                  par[c] = c;
                   contador_1 = contador_1 + 1;
              }
              
              if(c % 3 == 0){
                  impar[c] = c;
                   contador_2 = contador_2 + 1;
              }
         }
          
        System.out.println("Números pares: " + contador_1);
          for(int i = 0; i < num; i++){
              if(par[i] != 0){
                  System.out.println(par[i]);
          }
        }
          
        System.out.println("Números impares: " + contador_2); 
          for(int i = 0; i < num; i++){
              if(impar[i] != 0){
                  System.out.println(impar[i]);
       }
     }
   }
 }

