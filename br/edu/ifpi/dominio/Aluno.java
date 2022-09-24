package br.edu.ifpi.dominio;

import java.util.Date;

public class Aluno{
    private String nomeAluno;
    private String emailAluno;
    private Date dataNasc;
    
    public Aluno (String nomeAluno, String emailAluno, Date dataNasc){
        this.nomeAluno = nomeAluno;
        this.emailAluno = emailAluno;
        this.dataNasc = dataNasc;
    }
    
    public String getNomeAluno() {
        return nomeAluno;
    }
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    public String getEmailAluno() {
        return emailAluno;
    }
    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }
    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
}
