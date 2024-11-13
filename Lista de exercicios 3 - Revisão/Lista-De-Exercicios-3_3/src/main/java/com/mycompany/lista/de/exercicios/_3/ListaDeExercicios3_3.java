/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista.de.exercicios._3;

import java.util.Scanner;

/**
 *
 * @author h.moreira
 */
public class ListaDeExercicios3_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int num1 = scan.nextInt();
        
        System.out.println("Digite o segundo numero");
        int num2 = scan.nextInt();
        
        if (num1>num2) {
            System.out.println("O numero "+num1+" e maior que o numero"+num2);
        } else {
            System.out.println("O numero "+num2+" e maior que o numero"+num1);
        }
    }
}
