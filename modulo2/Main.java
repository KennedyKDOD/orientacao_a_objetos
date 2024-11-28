public class Main {
    public static void main(String[] args) {
        // Criando um autor
        Autor autor = new Autor("Kahlil Gibran", "Arabe");

        // Criando um livro
        Livro livro = new Livro("O Profeta", autor, "Poesia em prosa");

        // Criando um usuário
        Usuario usuario = new Usuario("Kennedy Duarte", 24);

        // Criando as datas
        String dataRetirada = "08/05/2024";
        String dataDevolucao = "15/05/2024";

        // Criando o empréstimo
        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);

        // Exibindo os detalhes do empréstimo
        if (!livro.isDisponivel()) {
            System.out.println("O livro não está disponível");
        }
        System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
        System.out.println("Autor: " + emprestimo.getLivro().getAutor().getNome());
        System.out.println("Gênero: " + emprestimo.getLivro().getGenero());
        System.out.println("Usuário: " + emprestimo.getUsuario().getNome());
        System.out.println("Idade: " + emprestimo.getUsuario().getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolução: " + emprestimo.getDataDevolucao());
    }
}
