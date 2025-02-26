package com.mycompany.app.Model;

public class Livro extends Publicacao {  // Agora Livro herda de Publicacao
    private String genero;
    private boolean disponivel;

    public Livro(String titulo, Autor autor, String genero, boolean disponivel) {
        super(titulo, autor); // Chama o construtor da classe Publicacao
        this.genero = genero;
        this.disponivel = disponivel;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void validarDisponibilidade() {
        if (!disponivel) {
            System.out.println("Livro não está disponível para empréstimo.");
        }
    }
}
