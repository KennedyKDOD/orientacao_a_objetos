package com.mycompany.app;

import com.mycompany.app.Interface.EstrategiaPublicacao;
import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.EstrategiaPublicacaoArtigo;
import com.mycompany.app.Model.EstrategiaPublicacaoLivro;
import com.mycompany.app.Model.UsuarioDecorator;

public class TestePublicacao {
    public static void main(String[] args) {
        Autor autor = new Autor("João Silva", "Brasileira", "Autor");
        UsuarioDecorator usuario = new UsuarioDecorator(autor);

        // Testando publicação de livros
        EstrategiaPublicacao estrategiaLivro = new EstrategiaPublicacaoLivro();
        usuario.setEstrategiaPublicacao(estrategiaLivro);
        usuario.publicar();

        // Testando publicação de artigos
        EstrategiaPublicacao estrategiaArtigo = new EstrategiaPublicacaoArtigo();
        usuario.setEstrategiaPublicacao(estrategiaArtigo);
        usuario.publicar();
    }
}
