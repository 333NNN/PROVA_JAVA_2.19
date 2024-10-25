/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pergunta_2_prova_nata;

import java.util.Scanner;

/**
 *
 * @author ncunha
 */
public class Pergunta_2_PROVA_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int anos, meses, dias, idadeDias;

        System.out.println("Escreva sua idade em anos, meses e dias, inserindo um de cada vez: ");
        anos = read.nextInt();
        meses = read.nextInt();
        dias = read.nextInt();

        idadeDias = (anos*365) + (meses*30) + dias;
        System.out.println("Sua idade em dias é: " + idadeDias);
    }
}
