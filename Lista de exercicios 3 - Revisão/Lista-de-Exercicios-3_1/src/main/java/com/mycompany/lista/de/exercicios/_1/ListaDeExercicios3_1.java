/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista.de.exercicios._1;

import java.util.Scanner;

/**
 *
 * @author h.moreira
 */
public class ListaDeExercicios3_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int num1 = scan.nextInt();
        
        System.out.println("Digite o segundo numero");
        int num2 = scan.nextInt();
        
        int soma = num1+num2;
        System.out.println("Soma de "+num1+" com "+num2+" = "+soma);
                
        

        
    }
}