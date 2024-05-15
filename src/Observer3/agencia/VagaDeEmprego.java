package Observer3.agencia;

public class VagaDeEmprego {
    private String titulo;
    private String descricao;

    public VagaDeEmprego(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Vaga de Emprego:\n" +
                "Título: " + titulo + "\n" +
                "Descrição: " + descricao;
    }
}
