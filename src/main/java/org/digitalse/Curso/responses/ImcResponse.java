package org.digitalse.Curso.responses;

public class ImcResponse {
    private float imc;
    private String classificacao;
    private String risco;

    public ImcResponse(float imc, String classificacao, String risco) {
        this.imc = imc;
        this.classificacao = classificacao;
        this.risco = risco;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getRisco() {
        return risco;
    }

    public void setRisco(String risco) {
        this.risco = risco;
    }
}
