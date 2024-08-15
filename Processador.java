/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade.pkg15.pkg8;

/**
 *
 * @author Aluno
 */
public class Processador extends Marcamodelo{
    
    String frenquencia;

    public Processador(String frenquencia, String marca, String modelo) {
        super(marca, modelo);
        this.frenquencia = frenquencia;
    }

    public String getFrenquencia() {
        return frenquencia;
    }

    public void setFrenquencia(String frenquencia) {
        this.frenquencia = frenquencia;
    }
    
    
    
    
    
    
    
}
