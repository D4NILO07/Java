/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herançaatividade;

/**
 *
 * @author Aluno
 */
public class Memoria extends marcamodelo {
    
    String armazenamento;

    public Memoria(String armazenamento, String marca, String modelo) {
        super(marca, modelo);
        this.armazenamento = armazenamento;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    
    
    
    
}
