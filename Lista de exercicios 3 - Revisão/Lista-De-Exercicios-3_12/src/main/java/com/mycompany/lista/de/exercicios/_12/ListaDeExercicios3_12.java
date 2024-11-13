/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista.de.exercicios._12;

import java.util.Scanner;

/**
 *
 * @author h.moreira
 */
public class ListaDeExercicios3_12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero:");
        int num = scan.nextInt();

        if (Primo(num)) {
            System.out.println(num + " e um numero primo.");
        } else {
            System.out.println(num + " nao e um numero primo.");
        }
    }

    public static boolean Primo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
