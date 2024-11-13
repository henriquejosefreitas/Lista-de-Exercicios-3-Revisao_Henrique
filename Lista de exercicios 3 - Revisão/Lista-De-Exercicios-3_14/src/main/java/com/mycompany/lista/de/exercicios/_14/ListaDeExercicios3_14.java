/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista.de.exercicios._14;

import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 *
 * @author h.moreira
 */
public class ListaDeExercicios3_14 {

    public static void main(String[] args) {
        
        int numFuncionarios = Integer.parseInt(JOptionPane.showInputDialog("Quantos funcionários deseja cadastrar?"));
        
        String[] nomesFuncionarios = new String[numFuncionarios];
        double[] salariosFuncionarios = new double[numFuncionarios];
        
        for (int i = 0; i < numFuncionarios; i++) {
            nomesFuncionarios[i] = JOptionPane.showInputDialog("Nome do funcionário " + (i + 1) + ":");
            salariosFuncionarios[i] = Double.parseDouble(JOptionPane.showInputDialog("Salário do funcionário " + (i + 1) + ":"));
        }
        
        int atualizar = JOptionPane.showConfirmDialog(null, "Deseja atualizar o salário de algum funcionário?", "Atualização de Salário", JOptionPane.YES_NO_OPTION);
        
        if (atualizar == JOptionPane.YES_OPTION) {
            String nomeAtualizar = JOptionPane.showInputDialog("Digite o nome do funcionário que deseja atualizar:");
            boolean encontrado = false;
            
            for (int i = 0; i < numFuncionarios; i++) {
                if (nomesFuncionarios[i].equalsIgnoreCase(nomeAtualizar)) {
                    salariosFuncionarios[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o novo salário de " + nomesFuncionarios[i] + ":"));
                    JOptionPane.showMessageDialog(null, "Salário atualizado com sucesso!");
                    encontrado = true;
                }
            }
            
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "Funcionário não encontrado!");
            }
        }
        
        StringBuilder listaFuncionarios = new StringBuilder("Lista de Funcionários:\n");
        for (int i = 0; i < numFuncionarios; i++) {
            listaFuncionarios.append(nomesFuncionarios[i]).append(" - Salário: ").append(salariosFuncionarios[i]).append("\n");
        }
        
        JOptionPane.showMessageDialog(null, listaFuncionarios.toString());
        
        try (PrintWriter writer = new PrintWriter(new FileWriter("funcionarios.txt"))) {
            writer.write(listaFuncionarios.toString());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados dos funcionários em arquivo.");
        }
        System.out.println("Arquivo enviado!");
    }
}