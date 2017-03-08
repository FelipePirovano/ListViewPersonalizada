package com.example.usuario.listviewpersonalizada;

public class AtributosDaLista {

    private String pergunta;
    private String resposta;

    public String getPergunta() {
        return pergunta;
    }
    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public AtributosDaLista(String pergunta, String resposta) {
        this.pergunta = pergunta;
        this.resposta = resposta;

    }
}

