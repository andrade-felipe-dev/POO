/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifpr;

import java.util.ArrayList;

/**
 *
 * @author Felipe Andrade
 */
public class Turma {
    private Professor professor;
    private ArrayList<Aluno> Aluno = new ArrayList<>();
    
    public void addAluno(Aluno Aluno)  {
        this.Aluno.add(Aluno);
    }
    
    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
