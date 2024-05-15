package FacadeExercícios4.pedido;

import FacadeExercícios4.produto.Produto;

public class ItemPedido {
    private int quantidade;
    private Produto produto;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public double getPrecoTotal() {
        return produto.getPreco() * quantidade;
    }
}