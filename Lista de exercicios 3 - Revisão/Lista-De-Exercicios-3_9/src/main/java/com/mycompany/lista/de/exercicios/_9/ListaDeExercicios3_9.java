/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista.de.exercicios._9;

import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author h.moreira
 */
public class ListaDeExercicios3_9 {


    public static void main(String[] args) {
        String nomeCliente = JOptionPane.showInputDialog("Digite seu nome:");
        int quantidadeItens = Integer.parseInt(JOptionPane.showInputDialog("Quantos itens deseja pedir?"));
        
        String[] nomesItens = new String[quantidadeItens];
        int[] quantidadesItens = new int[quantidadeItens];
        double[] precosItens = new double[quantidadeItens];
        
        for (int i = 0; i < quantidadeItens; i++) {
            nomesItens[i] = JOptionPane.showInputDialog("Nome do item " + (i + 1) + ":");
            quantidadesItens[i] = Integer.parseInt(JOptionPane.showInputDialog("Quantidade do item " + (i + 1) + ":"));
            precosItens[i] = Double.parseDouble(JOptionPane.showInputDialog("Preço do item " + (i + 1) + ":"));
        }
        
        double totalPedido = 0;
        StringBuilder resumoPedido = new StringBuilder("Resumo do pedido:\n");
        resumoPedido.append("Cliente: ").append(nomeCliente).append("\n");
        resumoPedido.append("Itens:\n");
        
        for (int i = 0; i < quantidadeItens; i++) {
            double valorItem = quantidadesItens[i] * precosItens[i];
            totalPedido += valorItem;
            resumoPedido.append(nomesItens[i]).append(" - Quantidade: ").append(quantidadesItens[i])
                         .append(" - Preço: ").append(precosItens[i]).append(" - Total: ").append(valorItem).append("\n");
        }
        
        resumoPedido.append("Valor total do pedido: ").append(totalPedido).append("\n");
        JOptionPane.showMessageDialog(null, resumoPedido.toString());
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("pedido.txt"))) {
            writer.write(resumoPedido.toString());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o pedido em arquivo.");
        }
    }
}
