package com.mycompany.app;

import com.mycompany.app.Model.Artigo;
import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Emprestimo;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Usuario;

public class Main {
    public static void main(String[] args) {
        // Criando um autor corretamente
        Autor autor = new Autor("Kahlil Gibran", "Arabe", "Autor Tradicional");

        // Criando um usuário que também pode ser autor
        Usuario usuarioAutor = new Usuario("Kennedy Duarte", 24);

        // Criando um livro
        Livro livro = new Livro("O Profeta", autor, "Poesia em prosa", true);
        livro.validarDisponibilidade();

        // Criando as datas do empréstimo
        String dataRetirada = "08/05/2024";
        String dataDevolucao = "15/05/2024";

        // Criando o empréstimo
        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuarioAutor);

        // Exibindo os detalhes do empréstimo
        System.out.println("--- Detalhes do Empréstimo ---");
        if (!livro.isDisponivel()) {
            System.out.println("O livro não está disponível para empréstimo.");
        }
        System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
        System.out.println("Autor: " + autor.getNome());
        System.out.println("Gênero: " + emprestimo.getLivro().getGenero());
        System.out.println("Usuário: " + emprestimo.getUsuario().getNome());
        System.out.println("Idade: " + usuarioAutor.getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolução: " + emprestimo.getDataDevolucao());

        // Criando um artigo corretamente com um Usuario Autor
        Artigo artigo = new Artigo("Entendendo Compiladores", usuarioAutor, "Tecnologia", true);

        // Exibindo os detalhes do artigo
        System.out.println("\n--- Detalhes do Artigo ---");
        System.out.println("Título: " + artigo.getTitulo());
        System.out.println("Autor: " + artigo.getAutor().getNome());
        System.out.println("Gênero: " + artigo.getGenero());
        System.out.println("Publicado: " + (artigo.isPublicado() ? "Sim" : "Não"));
    }
}
