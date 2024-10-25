/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pergunta_5_prova_nata;

import java.util.Scanner;

/**
 *
 * @author ncunha
 */
public class Pergunta_5_PROVA_NATA {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int codeUser = 1234, pass = 9999;
        int codTent, passTent;
        boolean check = false;

        while (!check) {
            System.out.println("Insira o código de usuário: ");
            codTent = read.nextInt();
            if(codTent == codeUser){
                System.out.println("Insira a senha: ");
                passTent = read.nextInt();
                if(passTent == pass){
                    System.out.println("Acesso permitido");
                    check = true;
                } 
                else{
                    System.out.println("Senha incorreta");
                }
            }
            else{
                System.out.println("Usuário inválido. Tente novamente.");
            }
        }
    }
}
