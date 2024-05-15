package FacadeExercícios4.produto;

public class Produto
{
    private int codigo;
    private double preco;
    private String categoria;
    private String nome;

    public Produto(int codigo, double preco, String categoria) {
        this.codigo = codigo;
        this.preco = preco;
        this.categoria = categoria;
    }

    public Produto(int codigo, double preco, String categoria, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.categoria = categoria;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getNome() { // Adiciona o método getNome()
        return nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}