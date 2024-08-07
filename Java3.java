/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java3;

/**
 *
 * @author Aluno
 */
public class Java3 {

    public static void main(String[] args) {
        //Declaração Variáveis 
        String nomeUsuario = "Marta";
        int senha = 123;
        
        //Comparação de Strings e inteiros 
        boolean resultadoNome = nomeUsuario.equals("Marta");
        boolean resultadoSenha = (senha == 456);
        
        //Exibindo Resultados
        System.out.println("O nome do usuário está correto? " + resultadoNome);
        System.out.println("A senha está correta? " + resultadoSenha);
    }
}
