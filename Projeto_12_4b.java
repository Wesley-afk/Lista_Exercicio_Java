/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_4b;

/**
 *
 * @author wpass
 */
import java.util.Scanner;
public class Projeto_12_4b {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
      //predefenindo um usuário e senha.
       int senha = 1234;
        int senha_digitada = 0;
         int c = 0;
          String usuario = "Wesley";
           String usuario_digitado = "";
            boolean autenticado = false;
      
            while(c < 3 && !autenticado){ //no caso enquanto autenticado for igual a falso.
                System.out.println("Digite seu usuário e senha para logar");
                 usuario_digitado = ler.nextLine();
                  senha_digitada = ler.nextInt();
                  
                  if(usuario_digitado != usuario & senha_digitada != senha){
                      System.out.println("Você errou usuário e senha. tente novamente.");
                       c = c + 1;
                  }
                   
                  else if(usuario_digitado != usuario){
                      System.out.println("usuário está incorreto. tente novamente.");
                       c = c + 1;
                  }
                  
                  else if(senha_digitada != senha){
                      System.out.println("senha está incorreta. tente novamente.");
                       c = c + 1;
                  }
                  
                  else if(usuario_digitado == usuario & senha_digitada == senha){
                      autenticado = true;
                  }
            }
    }
}
