/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista.de.exercicios._18;

import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 *
 * @author h.moreira
 */
public class ListaDeExercicios3_18 {

    public static void main(String[] args) {

        int numFuncionarios = Integer.parseInt(JOptionPane.showInputDialog("Quantos funcionários deseja cadastrar para cálculo de férias?"));
        
        String[] nomesFuncionarios = new String[numFuncionarios];
        double[] salariosFuncionarios = new double[numFuncionarios];
        double[] feriasFuncionarios = new double[numFuncionarios];
        
        for (int i = 0; i < numFuncionarios; i++) {
            nomesFuncionarios[i] = JOptionPane.showInputDialog("Nome do funcionário " + (i + 1) + ":");
            salariosFuncionarios[i] = Double.parseDouble(JOptionPane.showInputDialog("Salário do funcionário " + (i + 1) + ":"));
            feriasFuncionarios[i] = salariosFuncionarios[i] * 1/3;
        }
        
        StringBuilder listaFerias = new StringBuilder("Lista de Férias:\n");
        for (int i = 0; i < numFuncionarios; i++) {
            double valorFerias = salariosFuncionarios[i] + feriasFuncionarios[i];
            listaFerias.append("Nome: ").append(nomesFuncionarios[i])
                       .append(" - Salário: ").append(salariosFuncionarios[i])
                       .append(" - Férias (Salário + 1/3): ").append(valorFerias).append("\n");
        }
        
        JOptionPane.showMessageDialog(null, listaFerias.toString());
        
        try (PrintWriter writer = new PrintWriter(new FileWriter("ferias.txt"))) {
            writer.write(listaFerias.toString());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados das férias em arquivo.");
        }
        System.out.println("Arquivo enviado!");
    }
}
