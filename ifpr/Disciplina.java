/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifpr;

/**
 *
 * @author Felipe Andrade
 */
public class Disciplina implements LancamentoNota{
    private String nomeDisciplina;
    private int horaCurricular;
    
    Disciplina(String nomeDisciplina, int horaCurricular) {
        this.nomeDisciplina = nomeDisciplina;
        this.horaCurricular = horaCurricular;
    }
    
    @Override
    public String getNomeDisciplina() {
       return this.nomeDisciplina;
    }

    @Override
    public int getHoraCurricular() {
        return this.horaCurricular;
    }
  
}
