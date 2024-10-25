/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pergunta_3_prova_nata;

import java.util.Scanner;

/**
 *
 * @author ncunha
 */
public class Pergunta_3_PROVA_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean check = false;
        float cafeExpr = 0.75f, capuccino = 1.0f, leiteCafe = 1.25f, total = 0f;
        int qntdCafe = 0, qntdCapuc = 0, qntdLeiteCafe = 0, qntdTotal = 0;

        System.out.println("Bem vindo ao Café Java!");

            while(!check) {
                System.out.println("Escolha sua opção:\n1 - Café Expresso 2 - Café Capuccino 3 - Leite com Café 4 - Totalizar Vendas;");
                int escolha = read.nextInt();
                
                switch (escolha) {
                    case 1:
                        qntdCafe++;
                        total += cafeExpr;
                        System.out.println("Saindo um Expresso quentinho!");
                        break;
                    case 2:
                        qntdCapuc++;
                        total += capuccino;
                        System.out.println("Saindo um capuccino delicioso!");
                        break;
                    case 3:
                        qntdLeiteCafe++;
                        total += leiteCafe;
                        System.out.println("Saindo um pingado quentinho!");
                        break;
                    case 4:
                        System.out.println("\nComanda:");
                        if (qntdCafe > 0) {
                            System.out.println("Café Expresso: " + qntdCafe + " X R$" + cafeExpr + " = " + qntdCafe * cafeExpr);
                        }
                        if (qntdCapuc > 0) {
                            System.out.println("Capuccino: " + qntdCapuc + " X  R$" + capuccino + " = " + qntdCapuc * capuccino);
                        }
                        if (qntdLeiteCafe > 0) {
                            System.out.println("Leite com café: " + qntdLeiteCafe + " X  R$" + leiteCafe + " = " + qntdLeiteCafe * leiteCafe);
                        }
                        qntdTotal = qntdCafe + qntdCapuc + qntdLeiteCafe;
                        System.out.println("Total de produtos: " + qntdTotal + "\nValor total R$" + total);
                        check = true;
                        break;
                    default:
                        System.out.println("Produto inválido. Tente novamente.");
                        break;
                }
            }

    }
}
