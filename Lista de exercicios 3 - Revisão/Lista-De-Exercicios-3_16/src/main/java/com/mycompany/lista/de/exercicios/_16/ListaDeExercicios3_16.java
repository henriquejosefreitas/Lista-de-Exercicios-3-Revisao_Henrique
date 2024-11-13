/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista.de.exercicios._16;

/**
 *
 * @author h.moreira
 */
public class ListaDeExercicios3_16 {

    public static void main(String[] args) {
        int[] pontuacoes = {90, 70, 50, 80, 60, 85};
        
        System.out.println("Pontuacoes antes da ordenacao:");
        for (int pontuacao : pontuacoes) {
            System.out.print(pontuacao + " ");
        }
        
        bubbleSort(pontuacoes);
        
        System.out.println("\nPontuacoes apos a ordenacao:");
        for (int pontuacao : pontuacoes) {
            System.out.print(pontuacao + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean trocou;
        
        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    trocou = true;
                }
            }
            if (!trocou) break;
        }
    }
}
