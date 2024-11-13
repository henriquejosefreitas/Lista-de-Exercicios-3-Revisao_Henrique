/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista.de.exercicios._5;

/**
 *
 * @author h.moreira
 */
public class ListaDeExercicios3_5 {

    public static void main(String[] args) {

        for (int i = 10; i >= 0; i--) {
            System.out.println("Tempo restante: " + i + " segundos");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Erro na contagem regressiva: " + e.getMessage());
            }
        }

        System.out.println("contagem finalizada!");
    }

    }
