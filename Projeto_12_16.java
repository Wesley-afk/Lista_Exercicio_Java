/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_16;

/**
 *
 * @author w.rocha
 */
import java.util.Scanner;
public class Projeto_12_16 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         String palavra;
          String inverso = "";
          int num = 0;
          
          System.out.println("Digite a sua palavra");
           palavra = ler.nextLine();
            num = palavra.length();
            
            for(int c = num -1; c >= 0; c--){
                inverso += palavra.charAt(c);
            }
             
            System.out.println("Palavra digitada: " + palavra);
             System.out.println("Palavra contrária: " + inverso);
             
            if(inverso.equals(palavra)){
                System.out.println("A palavra é um Palindromo");
            }
            
            else if(inverso != palavra){
                System.out.println("Não é Palindromo");
            }
          
    }
}
