/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade13.pkg8;

/**
 *
 * @author Aluno
 */
public class Atividade138 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        endereco Endereco = new endereco("Rua das Bananeiras", 34, "Salvador");
                
        cliente Cliente = new cliente ("Danilo", 17, Endereco);
        
        System.out.println("=== Dados do cliente ===");
        System.out.println("Nome: " + Cliente.getNome());
        System.out.println("Idade: " + Cliente.getIdade());
        
        System.out.println("=== Endereco do Cliente ===");
        System.out.println("Logradouro: " + Cliente.getEndereco().getLogradouro());
        System.out.println("Numero: " + Cliente.getEndereco().getNumeroDaCasa());
        System.out.println("Cidade: " + Cliente.getEndereco().getCidade());
        
        
        
    }
    
}
