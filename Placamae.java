/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade.pkg15.pkg8;

/**
 *
 * @author Aluno
 */
public class Placamae extends Marcamodelo{
    
    String Soquete;

    public Placamae(String Soquete, String marca, String modelo) {
        super(marca, modelo);
        this.Soquete = Soquete;
    }

    public String getSoquete() {
        return Soquete;
    }

    public void setSoquete(String Soquete) {
        this.Soquete = Soquete;
    }

    
}
