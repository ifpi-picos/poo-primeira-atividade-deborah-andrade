package br.edu.ifpi.dominio;

import java.util.Date;

public class Curso {
    private String nomeCurso;
    private String modalidade;
    private Date dataInicio;
    private Date dataFinal;
   
   public Curso (String nomeCurso, String modalidade, Date dataFinal, Professor p1, Date dataIncio){
    this.nomeCurso = nomeCurso;
    this.modalidade = modalidade;
    this.dataInicio = dataInicio;
    this.dataFinal = dataFinal;
   }

public Curso(String nomeCurso2, String nivelCurso, int parseInt, Professor v1) {
}

public String getNomeCurso() {
    return nomeCurso;
}

public void setNomeCurso(String nomeCurso) {
    this.nomeCurso = nomeCurso;
}

public String getModalidade() {
    return modalidade;
}

public void setModalidade(String modalidade) {
    this.modalidade = modalidade;
}

public Date getDataInicio() {
    return dataInicio;
}

public void setDataInicio(Date dataInicio) {
    this.dataInicio = dataInicio;
}

public Date getDataFinal() {
    return dataFinal;
}

public void setDataFinal(Date dataFinal) {
    this.dataFinal = dataFinal;
}

public String getNomeAluno() {
    return null;
}

public void realizarMatricula(Aluno novoAluno) {
}
   
}