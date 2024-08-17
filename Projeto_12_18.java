/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_18;

/**
 *
 * @author w.rocha
 */
import java.util.Scanner;
public class Projeto_12_18 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         int tipo = 0;
         
        System.out.println("Insira o tipo do veículo\n 1 - carro\n 2 - caminhão\n 3 - moto");
         tipo = ler.nextInt();
         
         if(tipo == 1){
              System.out.println("Valor a ser pago = 20");
         }
         
         else if(tipo == 2){
              System.out.println("Valor a ser pago = 35");
         }
         
         else if(tipo == 3){
             System.out.println("Valor a ser pago = 15");
         }
    }
}
