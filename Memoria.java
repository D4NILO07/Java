/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade.pkg15.pkg8;

/**
 *
 * @author Aluno
 */
public class Memoria extends Marcamodelo {
    
    String frequencia;
    String armazenamento;

    public Memoria(String frequencia, String armazenamento, String marca, String modelo) {
        super(marca, modelo);
        this.frequencia = frequencia;
        this.armazenamento = armazenamento;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }
    
    
}
