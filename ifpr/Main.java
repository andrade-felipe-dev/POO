/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifpr;

import javax.swing.JOptionPane;

/**
 *
 * @author Felipe Andrade
 */
public class Main {
    public static void main(String[] args) {
        String nomeAluno = JOptionPane.showInputDialog("Digite o nome do Aluno");
        String nomeRuaAluno = JOptionPane.showInputDialog("Digite o nome da rua do Aluno");
        String numeroRuaAluno = JOptionPane.showInputDialog("Digite o numero da rua do Aluno");
        String nomeBairroAluno = JOptionPane.showInputDialog("Digite o nome do bairro  do Aluno");
        String idadeAluno = JOptionPane.showInputDialog("Digite a idade do Aluno");
        String nomeProfessor = JOptionPane.showInputDialog("Digite o nome do Professor");
        String nomeRuaProfessor = JOptionPane.showInputDialog("Digite o nome da rua do Professor");
        String numeroRuaProfessor = JOptionPane.showInputDialog("Digite o numero da rua do Professor");
        String nomeBairroProfessor = JOptionPane.showInputDialog("Digite o nome do bairro  do Professor");
        String idadeProfessor = JOptionPane.showInputDialog("Digite a idade do Professor");
        String nomeDisciplina = JOptionPane.showInputDialog("Digite a materia");
        String cargaHoraria = JOptionPane.showInputDialog("Digite sua carga horaria");
        String nota = JOptionPane.showInputDialog("Digite sua carga horaria");
        Aluno aluno1 = new Aluno(nomeAluno, new Endereco(nomeRuaAluno, Integer.parseInt(numeroRuaAluno), nomeBairroAluno), Integer.parseInt(idadeAluno), new Turma());
        Professor professor1 = new Professor(nomeProfessor, new Endereco(nomeRuaProfessor, Integer.parseInt(numeroRuaProfessor), nomeBairroProfessor), Integer.parseInt(idadeProfessor));
        Disciplina disciplina1 = new Disciplina(nomeDisciplina, Integer.parseInt(cargaHoraria));
        System.out.println(professor1.lancarNota(aluno1, disciplina1, Double.parseDouble(nota)));
    }
}
