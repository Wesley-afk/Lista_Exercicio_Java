/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_9;

/**
 *
 * @author wpass
 */
import java.util.Scanner;
public class Projeto_12_9 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         int num = 0;
         
         System.out.println("Digite um número");
          num = ler.nextInt();
           System.out.println("Numeros divisiveis:");
          
          for(int c = 1; c < num; c++){
              if(num % c == 0){
                  System.out.println(c);
              }
          }
    }
}
