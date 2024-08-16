/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_13;

/**
 *
 * @author wpass
 */
import java.util.Scanner;
public class Projeto_12_13 {
    
    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
       int ano = 0;
       
      System.out.println("Digite um ano");
       ano = ler.nextInt();
       
       if(ano % 4 == 0){
           System.out.println("O ano é bissexto");
       }
       
       else{
           System.out.println("O ano não é bissexto");
       }
    }        
}
