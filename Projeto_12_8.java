/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_8;

/**
 *
 * @author wpass
 */
import java.util.Scanner;
public class Projeto_12_8 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         String senha = "";
           boolean autenticado = false;
           
       System.out.println("Crie sua senha.");
         senha = ler.nextLine();
         
           while(autenticado == false){
            
               if(senha.length() < 8){
                   System.out.println("A senha prescisa ter 8 ou mais caracteres.");
                     senha = ler.nextLine();
               }
               
               else if(senha.length() >= 8){
                   System.out.println("Senha criada.");
                      autenticado = true;        
               }
           }
    }
}
