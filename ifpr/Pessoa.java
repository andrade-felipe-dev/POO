/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifpr;

/**
 *
 * @author Felipe Andrade
 */
abstract class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco;
    private int id;
    
    Pessoa(String nome, Endereco endereco, int idade) {
       this.id = this.incrementId();
       this.nome = nome;
       this.endereco = endereco;
       this.idade = idade;
    }
    
    private int incrementId() {
        return this.id++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
