/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herançaatividade;

/**
 *
 * @author Aluno
 */
public class HerançaAtividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Memoria memoria = new Memoria("200", "GigaByte", "Sata");
        Processador processador = new Processador("120", "Intel", "I5");
        
        System.out.println("D=== Dados da memoria ===");
        System.out.println("Marca: " + memoria.getMarca());
        System.out.println("Modelo: " + memoria.getModelo());
        System.out.println("Armazenamento: " + memoria.getArmazenamento());
        
        System.out.println("=== Dados Processador ===");
        System.out.println("Marca: " + processador.getMarca());
        System.out.println("Modelo: " + processador.getModelo());
        System.out.println("Frenquencia: " + processador.getFrequencia());
        
        
    }
    
}
