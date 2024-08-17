/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_20;

/**
 *
 * @author w.rocha
 */
import java.util.Scanner;
public class Projeto_12_20 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         int compra = 0;
          double desconto = 0;
           double porcentagem_desconto = 0;
          
          System.out.println("Digite o valor total da compra.");
           compra = ler.nextInt();
           
          System.out.println("Digite a porcentagem de desconto.");
           desconto = ler.nextInt();
           
           if(desconto > 0 && desconto <= 100){
             porcentagem_desconto = (desconto / 100) * compra;
               System.out.println("O valor a ser pago é de: " + (compra - porcentagem_desconto));
           }
           
    }
}
