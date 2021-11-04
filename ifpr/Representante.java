/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifpr;

/**
 *
 * @author Felipe
 */
public class Representante extends Aluno {
    private int saldoTurma;
    
    public Representante(String nome, Endereco endereco, int idade, Turma turma) {
        super(nome, endereco, idade, turma);
    }
    
    public int retornarSaldo() {
        return this.saldoTurma;
    }
}
