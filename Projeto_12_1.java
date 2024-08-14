/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_1;

/**
 *
 * @author w.rocha
 */
import java.util.Scanner; //Importando o scanner
public class Projeto_12_1 {

    public static void main(String[] args){
//Declaração de variáveis
       Scanner ler = new Scanner(System.in);
         int[] Nota = new int[3];
           int Media = 0;
       
          for(int a = 0; a < 3; a++){ //começando o laço de repetição para média
            System.out.println("Digite a nota " + (a + 1) +" do aluno");
              Nota[a] = ler.nextInt();
                Media = (Nota[0] + Nota[1] + Nota[2]) / 3; 
    }
          
          if(Media >= 7 ){
              System.out.println("O aluno está aprovado. \n Media = " + Media);
            }
          
          else if(Media == 5 & Media < 7){
              System.out.println("O aluno esta de recuperacao. \n Media = " + Media);
          }
          
          else if(Media < 5){
             System.out.println("O aluno está reprovado. \n Media = " + Media);
          }
    }
}
