/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista.de.exercicios._13;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 *
 * @author h.moreira
 */
public class ListaDeExercicios3_13 {

    public static void main(String[] args) {

        int quantidadeProdutos = Integer.parseInt(JOptionPane.showInputDialog("Quantos produtos deseja cadastrar?"));
        
        String[] nomesProdutos = new String[quantidadeProdutos];
        double[] precosProdutos = new double[quantidadeProdutos];
        
        for (int i = 0; i < quantidadeProdutos; i++) {
            nomesProdutos[i] = JOptionPane.showInputDialog("Nome do produto " + (i + 1) + ":");
            precosProdutos[i] = Double.parseDouble(JOptionPane.showInputDialog("Preço do produto " + (i + 1) + ":"));
        }
        
        StringBuilder listaProdutos = new StringBuilder("Lista de Produtos:\n");
        for (int i = 0; i < quantidadeProdutos; i++) {
            listaProdutos.append(nomesProdutos[i]).append(" - Preço: ").append(precosProdutos[i]).append("\n");
        }
        
        JOptionPane.showMessageDialog(null, listaProdutos.toString());
        
        try (PrintWriter writer = new PrintWriter(new FileWriter("produtos.txt"))) {
            writer.write(listaProdutos.toString());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar os produtos em arquivo.");
        }
        System.out.println("Arquivo enviado!");
    }
}
