/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_14;

/**
 *
 * @author w.rocha
 */
import java.util.Scanner;
import java.util.Random;
public class Projeto_12_14 {
    
    public static void main(String[] args) {
        
       Scanner ler = new Scanner(System.in);
        Random sorteio = new Random();
       
       int par_ou_impar = 0;
        int num = 0;
         int num_prog = 0;
          int resultado = 0;
       
       System.out.println("1 - Par \n2 - Impar");
        par_ou_impar = ler.nextInt();
        
       System.out.println("Digite um número de 0 a 100");
        num = ler.nextInt();
         
          num_prog = sorteio.nextInt(100);
           System.out.println("Numero sorteado por computador = " + num_prog);
             resultado = num_prog + num;
           
           if(resultado % 2 == 0){
               System.out.println("A soma dos dois números é igual há: " + resultado);
               
                if(par_ou_impar == 1){
                    System.out.println("Você venceu!");
                }
           }
           
           else{
               System.out.println("A soma dos dois números é igual há: " + resultado);
               
                if(par_ou_impar == 2){
                    System.out.println("Você venceu!");
                }
           }
    }
}
