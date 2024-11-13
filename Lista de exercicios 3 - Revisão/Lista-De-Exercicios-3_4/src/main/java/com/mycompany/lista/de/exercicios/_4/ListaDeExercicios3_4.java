/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista.de.exercicios._4;

import java.util.Scanner;

/**
 *
 * @author h.moreira
 */
public class ListaDeExercicios3_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero da tabuada:");
        int num = scan.nextInt();
        
        for(int i=1; i<11; i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
}
