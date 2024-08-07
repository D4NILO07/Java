/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java2;

/**
 *
 * @author Aluno
 */
public class Java2 {

    public static void main(String[] args) {
        String nome = "Marta";
        String sobrenome = "Silveira";
        
        //Exibinod a quantidade de carcteres 
        System.out.println("Tamanho do nome: " + nome.length());
        System.out.println("Tamanho do sobrenome: " + sobrenome.length());
        
        //Concatenando nome + msobrenome
        String nomeCompleto = nome.concat( " ").concat(sobrenome);
        
        //Exibindo nome completo usando métodos Strings - Maiúsculas 
        System.out.println("Concatenação Maiúscula: " + nomeCompleto.toUpperCase());
        
        //Exibindo nome completo usando métodos Strings - Minúsculas 
        System.out.println("Concatenação Minúscula: " + nomeCompleto.toLowerCase());
        
    }
}
