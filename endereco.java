/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade13.pkg8;

/**
 *
 * @author Aluno
 */
public class endereco {
    
    private String logradouro;
    private int numeroDaCasa;
    private String cidade;

    public endereco(String logradouro, int numeroDaCasa, String cidade) {
        this.logradouro = logradouro;
        this.numeroDaCasa = numeroDaCasa;
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumeroDaCasa() {
        return numeroDaCasa;
    }

    public void setNumeroDaCasa(int numeroDaCasa) {
        this.numeroDaCasa = numeroDaCasa;
    }
    
    
    
}
