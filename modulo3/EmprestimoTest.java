package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.Date;

public class EmprestimoTest {

    @Test
    public void testGetDataRetirada() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);
        Emprestimo emprestimo = new Emprestimo(dataRetirada.toString(), dataDevolucao.toString(), livro, usuario);

        assertEquals(dataRetirada.toString(), emprestimo.getDataRetirada());
    }

    @Test
    public void testGetDataDevolucao() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);
        Emprestimo emprestimo = new Emprestimo(dataRetirada.toString(), dataDevolucao.toString(), livro, usuario);

        assertEquals(dataDevolucao.toString(), emprestimo.getDataDevolucao());
    }

    @Test
    public void testGetLivro() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);
        Emprestimo emprestimo = new Emprestimo(dataRetirada.toString(), dataDevolucao.toString(), livro, usuario);

        assertEquals("Java Basics", emprestimo.getLivro().getTitulo());
    }

    @Test
    public void testGetUsuario() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);
        Emprestimo emprestimo = new Emprestimo(dataRetirada.toString(), dataDevolucao.toString(), livro, usuario);

        assertEquals("Gabriel", emprestimo.getUsuario().getNome());
    }
}
