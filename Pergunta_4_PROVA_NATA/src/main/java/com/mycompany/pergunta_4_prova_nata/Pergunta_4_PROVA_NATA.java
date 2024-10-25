/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pergunta_4_prova_nata;

import javax.swing.JOptionPane;

/**
 *
 * @author ncunha
 */
public class Pergunta_4_PROVA_NATA {

    public static void main(String[] args) {
        int num, ant, post;

        String inputNum = JOptionPane.showInputDialog(null, "Digite qualquer número inteiro : ", "Entrada de dados", JOptionPane.QUESTION_MESSAGE);
        num = Integer.parseInt(inputNum);

        ant = num - 1;
        post = num + 1;

        String message = "O antecessor é de " + num + " é " + ant + ", e o posterior é " + post;

        JOptionPane.showMessageDialog(null, message, "Inserção de dados", JOptionPane.INFORMATION_MESSAGE);
    }
}
