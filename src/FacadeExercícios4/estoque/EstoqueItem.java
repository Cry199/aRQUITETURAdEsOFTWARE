package FacadeExercícios4.estoque;

import FacadeExercícios4.produto.Produto;

public class EstoqueItem {
    private Produto produto;
    private int quantidade;

    public EstoqueItem(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}