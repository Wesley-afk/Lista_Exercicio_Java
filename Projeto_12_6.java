/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_12_6;

/**
 *
 * @author w.rocha
 */
import java.util.Scanner;
public class Projeto_12_6 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float altura;
        float peso;
        float imc;
        
          System.out.println("Digite a sua altura");
          altura = ler.nextFloat();
          
             System.out.println("Digite o seu peso");
               peso = ler.nextFloat();
          
                 imc = peso / (altura*altura);
                   System.out.println("Você tem um imc de:" + imc);
          
                 if(imc < 18.8){
                     System.out.println("Você está abaixo do peso.");
                 } 
                 else if(imc >= 18.5 || imc <= 24.9){
                     System.out.println("Peso normal");
                 }
                 else if(imc >= 25 || imc <= 29.9){
                     System.out.println("você está com excesso de peso");
                 }
                 else if(imc >= 30 || imc <= 34.9){
                     System.out.println("Você está com obesidade 1");
                 }
                 else if(imc >= 35 || imc <= 39.9){
                     System.out.println("Você está com obesidade 2");
                 }
                 else{
                     System.out.println("Você está com obesidade 3");
                 }
                  
    }
}
