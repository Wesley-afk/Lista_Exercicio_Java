/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_9;

/**
 *
 * @author w.rocha
 */
import java.util.Scanner;
public class Projeto_12_9 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         int base = 0;
          int expoente = 0;
           double resultado = 0;
          
          System.out.println("Digite a base");
           base = ler.nextInt();
           
          System.out.println("Digite o expoente");
           expoente = ler.nextInt();
          
           resultado = Math.pow(base, expoente);
           
           System.out.println(resultado);
        
    }
}
