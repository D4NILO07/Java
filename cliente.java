/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade13.pkg8;

/**
 *
 * @author Aluno
 */
public class cliente {
    
    private String nome;
    private int idade;
    private endereco Endereco;

    public cliente(String nome, int idade, endereco Endereco) {
        this.nome = nome;
        this.idade = idade;
        this.Endereco = Endereco;
    }

    public endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(endereco Endereco) {
        this.Endereco = Endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
            
}
