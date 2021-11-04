/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifpr;

/**
 *
 * @author Felipe Andrade
 */
public class Aluno extends Pessoa {
    private Turma turma;

    public Aluno(String nome, Endereco endereco, int idade, Turma turma) {
        super(nome, endereco, idade);
        this.turma = turma;
    }
}
