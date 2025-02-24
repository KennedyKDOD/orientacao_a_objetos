package com.mycompany.app.Model;

public class Autor {
    private String nome;
    private String nacionalidade;
    private String tipoAutor; // "Autor Tradicional" ou "Usuário Autor"

    public Autor(String nome, String nacionalidade, String tipoAutor) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.tipoAutor = tipoAutor;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getTipoAutor() {
        return tipoAutor;
    }
}
