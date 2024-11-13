/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista.de.exercicios._17;

import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 *
 * @author h.moreira
 */
public class ListaDeExercicios3_17 {

    public static void main(String[] args) {

        int quantidadeUsuarios = Integer.parseInt(JOptionPane.showInputDialog("Quantos usuários deseja cadastrar?"));
        
        String[] nomes = new String[quantidadeUsuarios];
        int[] idades = new int[quantidadeUsuarios];
        String[] emails = new String[quantidadeUsuarios];
        
        for (int i = 0; i < quantidadeUsuarios; i++) {
            nomes[i] = JOptionPane.showInputDialog("Nome do usuário " + (i + 1) + ":");
            idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Idade do usuário " + (i + 1) + ":"));
            emails[i] = JOptionPane.showInputDialog("E-mail do usuário " + (i + 1) + ":");
        }
        
        StringBuilder listaUsuarios = new StringBuilder("Lista de Usuários:\n");
        for (int i = 0; i < quantidadeUsuarios; i++) {
            listaUsuarios.append("Nome: ").append(nomes[i])
                          .append(", Idade: ").append(idades[i])
                          .append(", E-mail: ").append(emails[i])
                          .append("\n");
        }
        
        JOptionPane.showMessageDialog(null, listaUsuarios.toString());
        
        try (PrintWriter writer = new PrintWriter(new FileWriter("usuarios.txt"))) {
            writer.write(listaUsuarios.toString());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados dos usuários em arquivo.");
        }        
        System.out.println("Arquivo enviado!");
    }
}
