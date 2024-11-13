/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista.de.exercicios._2;

import java.util.Scanner;

/**
 *
 * @author h.moreira
 */
public class ListaDeExercicios3_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero da quantidade de itens em estoque: ");
        int quant = scan.nextInt();
        
        
        if (quant%2 == 0) {
            System.out.println("A quantidade de itens em estoque e par.");
        } else {
            System.out.println("A quantidade de itens em estoque e impar.");
        }
    }
}
