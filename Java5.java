/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java5;

/**
 *
 * @author Aluno
 */
public class Java5 {

    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios();
        
        funcionario.setNome("José");
        funcionario.setIdade(20);
        funcionario.setSalario(3000);
        
        
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.println("Salário: " + funcionario.getSalario());
    }
}
