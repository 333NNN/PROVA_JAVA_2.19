/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pergunta_8_prova_nata;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ncunha
 */
public class Pergunta_8_PROVA_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Date data = new Date();
        String caminho = "C:\\Users\\ncunha\\Desktop\\TESTE_NOVA_PASTA\\";
        System.out.println("Impressão de tabuada\nDigite um número para criarmos uma tabuada: ");
        int num = read.nextInt();

        try (FileWriter arquivo = new FileWriter(caminho + "tabuada_do_" + num + ".txt"); PrintWriter gravar = new PrintWriter(arquivo)) {

            gravar.printf("Tabuada do " + num + " | " + data + "\n");
            gravar.printf("---------------\n");

            for (int i = 1; i <= 10; i++) {
                gravar.printf(i + " x " + num + " = " + (i * num) + "\n");
            }
            gravar.printf("---------------\n");
            System.out.println("Arquivo para a tabuada do número " + num + " gerado com sucesso em " + caminho);

        } catch (IOException e) {
            System.out.println("Erro ao gerar o arquivo: " + e.getMessage());

        }
    }
}
