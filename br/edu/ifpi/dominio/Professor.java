package br.edu.ifpi.dominio;

public class Professor {
    private String nomeProf;
    private String formacao;
    private String email;
    
    public Professor (String nomeProf, String formacao, String email){
        this.nomeProf = nomeProf;
        this.formacao = formacao;
        this.email = email;
    }

    public String getNomeProf() {
        return nomeProf;
    }
    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }
    public String getFormacao() {
        return formacao;
    }
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
}
