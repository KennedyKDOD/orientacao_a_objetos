package com.mycompany.app.Model;

public class Artigo extends Publicacao { //Artigo herda de Publicacao
    private String genero;
    private boolean publicado;

    public Artigo(String titulo, Autor autor, String genero, boolean publicado) {
        super(titulo, autor); // Chama o construtor da classe Publicacao
        this.genero = genero;
        this.publicado = publicado;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isPublicado() {
        return publicado;
    }
}
