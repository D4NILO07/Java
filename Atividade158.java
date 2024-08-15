/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.pkg15.pkg8;

/**
 *
 * @author Aluno
 */
public class Atividade158 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Placamae placamae = new Placamae("LGA1155", "Asus", "Gaming");
        Memoria memoria = new Memoria("120", "16GB", "Kingston", "NVME");
        Processador processador = new Processador("3.5", "Intel", "I5");
        Dispositvoarmazenamento dispositivoarmazenamento = new Dispositvoarmazenamento("1TB", "SATA", "KINGSTON", "SSD");
        
        System.out.println("=== DADOS DA MEMORIA ===");
        System.out.println("Marca: " + memoria.getMarca());
        System.out.println("Modelo: " + memoria.getModelo());
        System.out.println("Armazenamento: " + memoria.getArmazenamento());
        
        System.out.println("=== DADOS DO PROCESSADOR ===");
        System.out.println("Marca: " + processador.getMarca());
        System.out.println("Modelo: " + processador.getModelo());
        System.out.println("Frenquencia: " + processador.getFrenquencia());
        
        System.out.println("=== DADOS DA PLACA MAE ===");
        System.out.println("Marca: " + placamae.getMarca());
        System.out.println("Modelo: " + placamae.getModelo());
        System.out.println("Soquete: " + placamae.getSoquete());
        
        System.out.println("=== DADOS DO DISPOSITIVO DE ARMAZENAMENRO ===");
        System.out.println("Marca: " + dispositivoarmazenamento.getMarca());
        System.out.println("Modelo: " + dispositivoarmazenamento.getModelo());
        System.out.println("Conexao: " + dispositivoarmazenamento.getConexao());
        System.out.println("Armazenamento: " + dispositivoarmazenamento.getArmazenameto());
        
        
        
               
        
        
        
    }
    
}
