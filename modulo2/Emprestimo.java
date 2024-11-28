public class Emprestimo {
    private String dataRetirada;
    private String dataDevolucao;
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(String dataRetirada, String dataDevolucao, Livro livro, Usuario usuario) {
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.livro = livro;
        this.usuario = usuario;

        if (livro.isDisponivel()) {
            livro.setDisponivel(false);
        } else {
            System.out.println("O livro não está disponível.");
        }
    }

    public String getDataRetirada() {
        return dataRetirada;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
