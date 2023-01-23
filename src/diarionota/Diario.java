/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diarionota;

/**
 *
 * @author Robson
 */
public class Diario {
  private String nomeCurso;
  double[] notasAlunos;
  
  public String getNomeCurso() {
          return nomeCurso;
  }
  
  public void setNomeCurso(String _nomeCurso) {
          nomeCurso = _nomeCurso;
  }
  
  public double getMediaTurma() {
    double somaNotas = 0;
    for (double nota : notasAlunos) {
      somaNotas += nota;
    }
    
    return somaNotas/notasAlunos.length;
  }
  
  public double getMenorNota() {
    double menorNota = notasAlunos[0];
    
    for (double nota : notasAlunos) {
      menorNota = nota;
    }
    
    return menorNota;
  }
  
}

