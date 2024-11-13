/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista.de.exercicios._11;
/**
 *
 * @author h.moreira
 */
public class ListaDeExercicios3_11 {

    public static void main(String[] args) {
        int[] dados = {15, 28, 3, 42, 9, 19};

        int maior = dados[0];
        int menor = dados[0];

        for (int i = 0; i < 6; i++) {
            if (dados[i] > maior) {
                maior = dados[i];
            }
            if (dados[i] < menor) {
                menor = dados[i];
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    
}
}
