/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista.de.exercicios._15;

import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 *
 * @author h.moreira
 */
public class ListaDeExercicios3_15 {

    public static void main(String[] args) {

        int numPessoas = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas participarão da pesquisa?"));
        
        String[] genMusc = {"Rock", "Pop", "Jazz", "Clássica", "Eletrônica"};
        int[] votos = new int[genMusc.length];
        
        for (int i = 0; i < numPessoas; i++) {
            String generoEscolhido = (String) JOptionPane.showInputDialog(null, "Qual é o seu gênero musical favorito?", "Pesquisa de Preferências Musicais", JOptionPane.QUESTION_MESSAGE, null, genMusc, genMusc[0]);
            for (int j = 0; j < genMusc.length; j++) {
                if (genMusc[j].equals(generoEscolhido)) {
                    votos[j]++;
                }
            }
        }
        
        StringBuilder resultadoPesquisa = new StringBuilder("Resultado da Pesquisa:\n");
        for (int i = 0; i < genMusc.length; i++) {
            resultadoPesquisa.append(genMusc[i]).append(": ").append(votos[i]).append(" votos\n");
        }
        
        JOptionPane.showMessageDialog(null, resultadoPesquisa.toString());
        
        try (PrintWriter writer = new PrintWriter(new FileWriter("resultado_pesquisa_musical.txt"))) {
            writer.write(resultadoPesquisa.toString());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar os resultados da pesquisa em arquivo.");
        }
    }
}
