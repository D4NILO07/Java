/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade1;

/**
 *
 * @author Aluno
 */
public class Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Livro livro = new Livro("E assim que acaba", "Collen Hoover", 390, 79);
        Livro livroDois = new Livro("E assim que comeca", "Collen Hoover", 370, 80);
        
        
        //livro.setLivro("E assim que acaba");
        //livro.setAutor("Collen Hoover");
        //livro.setPag(390);
        //livro.setPreco(79);
        
        System.out.println("Livro: " + livro.getLivro());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Quantidade de Paginas: " + livro.getPag());
        System.out.println("Preco: " + livro.getPreco());
        
        
        System.out.println("\nLivro: " + livroDois.getLivro());
        System.out.println("Autor: " + livroDois.getAutor());
        System.out.println("Quantidade de Paginas: " + livroDois.getPag());
        System.out.println("Preco: " + livroDois.getPreco());
        
        
                
        
        
    }
    
}
