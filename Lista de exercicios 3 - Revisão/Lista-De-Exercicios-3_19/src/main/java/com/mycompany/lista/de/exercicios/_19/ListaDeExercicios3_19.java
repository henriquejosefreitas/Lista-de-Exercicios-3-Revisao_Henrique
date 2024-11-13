/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista.de.exercicios._19;

import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 *
 * @author h.moreira
 */
public class ListaDeExercicios3_19 {

    public static void main(String[] args) {

        double salarioHora = Double.parseDouble(JOptionPane.showInputDialog("Quanto você ganha por hora?"));
        int horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Quantas horas trabalhou no mês?"));
        
        double salarioBruto = salarioHora * horasTrabalhadas;
        double impostoDeRenda = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - impostoDeRenda - inss - sindicato;
        
        String resultado = String.format(
            "+ Salário Bruto: R$ %.2f\n- Imposto de Renda (11%%): R$ %.2f\n- INSS (8%%): R$ %.2f\n- Sindicato (5%%): R$ %.2f\n= Salário Líquido: R$ %.2f",
            salarioBruto, impostoDeRenda, inss, sindicato, salarioLiquido
        );
        
        JOptionPane.showMessageDialog(null, resultado);
        
        try (PrintWriter writer = new PrintWriter(new FileWriter("salario_liquido_com_Descontos.txt"))) {
            writer.println(resultado);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados do salário em arquivo.");
        }
        System.out.println("Arquivo enviado!");
    }
}
