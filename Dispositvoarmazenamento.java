/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade.pkg15.pkg8;

/**
 *
 * @author Aluno
 */
public class Dispositvoarmazenamento extends Marcamodelo{
    
    String armazenameto;
    String conexao;

    public Dispositvoarmazenamento(String armazenameto, String conexao, String marca, String modelo) {
        super(marca, modelo);
        this.armazenameto = armazenameto;
        this.conexao = conexao;
    }

    public String getArmazenameto() {
        return armazenameto;
    }

    public void setArmazenameto(String armazenameto) {
        this.armazenameto = armazenameto;
    }

    public String getConexao() {
        return conexao;
    }

    public void setConexao(String conexao) {
        this.conexao = conexao;
    }
    
    

 
   
    
    
}
