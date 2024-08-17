/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.projeto_12_17;

/**
 *
 * @author w.rocha
 */
import java.util.Scanner;

public class Projeto_12_17 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String frase = "";
        String vogais = "aeiou";
        String vogais_maiusculas = "AEIOU";
        char vog;
        int total = 0;

        System.out.print("Digite uma frase: ");
        frase = ler.nextLine();

        for (int c = 0; c < frase.length(); c++) {
            vog = frase.charAt(c);
            for (int b = 0; b < 5; b++){
                if (vog == vogais.charAt(b) || vog == vogais_maiusculas.charAt(b)) {
                    total += 1;
                }
            }
        }
        System.out.println("vogais = " + total);
    }
}
