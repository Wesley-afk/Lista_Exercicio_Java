/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_4;

/**
 *
 * @author wpass
 */
import java.util.Scanner;
public class Projeto_12_4 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
          String nome = "";
           int senha = 0;
            String nome_real = "Wesley";
             int senha_real = 1234;
               int c = 0;
                      
             while(c < 3){
               System.out.println("Digite seu usuário.");
                  nome = ler.nextLine();
                    System.out.println("Digite sua senha.");
                      senha = ler.nextInt();
                     
                    if(senha != senha_real){
                        System.out.println("Senha incorreta, tente novamente.");
                           c = c + 1;
                    }
                    
                    else if(nome != nome_real){
                        System.out.println("Nome incorreto, tente novamente.");
                          c = c + 1;
                    }
                    
                    if(senha == senha_real){
                        System.out.println("Senha correta.");
                           c = c + 3; 
                    }
                    
                    if(nome == nome_real){
                        System.out.println("Nome correto.");
                           c = c + 3;
                    }
       }
    }
}
