/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade2.pkg13.pkg8;

/**
 *
 * @author Aluno
 */
public class Atividade2138 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pet pet = new Pet("Max", 8, "Pinscher");
        
        Cliente cliente = new Cliente("Danilo", 17, pet);
        
        System.out.println("=== Dados do Cliente ===");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        
        System.out.println("=== Dados do Pet ===");
        System.out.println("Nome: " + cliente.getPet().getNome());
        System.out.println("Idade: " + cliente.getPet().getIdade());
        System.out.println("Raca: " + cliente.getPet().getRaca());
              
 
        
        
    }
    
}
