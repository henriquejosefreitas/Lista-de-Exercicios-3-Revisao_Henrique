/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista.de.exercicios._6;

import java.util.Scanner;

/**
 *
 * @author h.moreira
 */
public class ListaDeExercicios3_6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        int num1 = scan.nextInt();
        
        System.out.println("Digite a segunda nota:");
        int num2 = scan.nextInt();

        System.out.println("Digite a terceira nota:");
        int num3 = scan.nextInt();

        
        int media = (num1+num2+num3)/3;
        System.out.println("Media das notas:"+media);    
    }
}
