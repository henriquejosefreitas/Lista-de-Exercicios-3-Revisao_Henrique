/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista.de.exercicios._7;

import java.util.Scanner;
/**
 *
 * @author h.moreira
 */
public class ListaDeExercicios3_7 {

    public static void main(String[] args){ 
        Scanner scan = new Scanner(System.in);
        int lista[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Digite o codigo:");
        int num = scan.nextInt();
        
        for(int i=0; i<10; i++){
        if (num == lista[i]) {
            System.out.println("O produto esta na lista de codigos.");
        }
        }
                
    }
}
