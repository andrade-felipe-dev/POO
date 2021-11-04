/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifpr;

/**
 *
 * @author Felipe Andrade
 */
public class Professor extends Pessoa {
    private String nivelGraduacao;
    private Disciplina disciplina;
    
    Professor(String nome, Endereco endereco, int idade) {
        super(nome, endereco, idade);
    }
    
    public String lancarNota(Aluno aluno, Disciplina disciplina, double nota) {
        return "Aluno:" + aluno.getNome() +
               " Disciplina: " + disciplina.getNomeDisciplina() + 
               " Nota: " + nota;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }
}
