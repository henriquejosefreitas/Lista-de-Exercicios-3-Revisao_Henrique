/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista.de.exercicios._10;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author h.moreira
 */
public class ListaDeExercicios3_10 {

    public static void main(String[] args) {

        int numClientes = Integer.parseInt(JOptionPane.showInputDialog("Quantos clientes participarão da pesquisa?"));
        
        String[] generos = {"Ação", "Comédia", "Drama", "Terror", "Romance"};
        int[] votos = new int[generos.length];
        
        for (int i = 0; i < numClientes; i++) {
            String generoEscolhido = (String) JOptionPane.showInputDialog(null, "Qual é o seu gênero de filme favorito?", "Pesquisa de Preferências de Filmes", JOptionPane.QUESTION_MESSAGE, null, generos, generos[0]);
            for (int j = 0; j < generos.length; j++) {
                if (generos[j].equals(generoEscolhido)) {
                    votos[j]++;
                }
            }
        }
        
        StringBuilder resultadoPesquisa = new StringBuilder("Resultado da Pesquisa:\n");
        for (int i = 0; i < generos.length; i++) {
            resultadoPesquisa.append(generos[i]).append(": ").append(votos[i]).append(" votos\n");
        }
        
        JOptionPane.showMessageDialog(null, resultadoPesquisa.toString());
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("resultado_pesquisa_filmes.txt"))) {
            writer.write(resultadoPesquisa.toString());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar os resultados da pesquisa em arquivo.");
        }
    }
}
