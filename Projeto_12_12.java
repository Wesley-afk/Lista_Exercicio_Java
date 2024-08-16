/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_12;

/**
 *
 * @author wpass
 */
import java.util.Scanner;
public class Projeto_12_12 {

    public static void main(String[] args) {
        
    // Interpretei Vários candidatos como 10.
        Scanner ler = new Scanner(System.in);
         int[] eleitor;
          int [] um = new int [10];
          int [] dois = new int [10];
          int [] tres = new int [10];
          int voto = 0;
          int resultado_um = 0;
          int resultado_dois = 0;
          int resultado_tres = 0;
          
         for(int c = 0; c < 10; c++){
             System.out.println("Eleitor " + (c + 1) + " vote");
              System.out.println("Lula");
               System.out.println("Bolsonaro");
                System.out.println("Ciro Gomes");
                 voto = ler.nextInt();
             
             if(voto == 1){
                  um[c] = 1;
             }
             
             else if(voto == 2){
                 dois[c] = 1;
             }
             
             else if(voto == 3){
                 tres[c] = 1;
             }
         }
          System.out.println("Quantidade de votos dos candidatos:");
          
          for(int c = 0; c < 10; c++){
            resultado_um += um[c];
        }
          System.out.println("Lula - " + resultado_um);
          
          for(int c = 0; c < 10; c++){
            resultado_dois += dois[c];
        }
          System.out.println("Bolsonaro - " + resultado_dois);
          
          for(int c = 0; c < 10; c++){
            resultado_tres += tres[c];
        }
          System.out.println("Ciro Gomes - " + resultado_tres);
          
          if(resultado_um > resultado_dois & resultado_um > resultado_tres){
              System.out.println("Lula venceu.");
          }
          
          else if(resultado_dois > resultado_um & resultado_dois > resultado_tres){
              System.out.println("Bolsonaro venceu.");
          }
          
          else if(resultado_tres > resultado_um & resultado_tres > resultado_dois){
              System.out.println("Ciro Gomes venceu.");
          }
          
          else{
              System.out.println("Empate.");
          }
    }
}
