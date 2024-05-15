package FacadeExercícios4.facade;

import FacadeExercícios4.estoque.Estoque;
import FacadeExercícios4.estoque.EstoqueItem;
import FacadeExercícios4.pedido.ItemPedido;
import FacadeExercícios4.pedido.Pedido;
import FacadeExercícios4.produto.Produto;

public class Facade {
    private Pedido pedido;
    private Estoque estoque;

    public Facade() {
        this.pedido = new Pedido();
        this.estoque = Estoque.getInstance();
    }

    public void criarPedido(ItemPedido item) {
        pedido.adicionarItem(item);
    }

    public double calcularTotal() {
        return pedido.calcularTotal();
    }

    public void imprimirCupomFiscal() {
        pedido.cupomFiscal();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        estoque.adicionarProduto(produto, quantidade);
    }

    public void exibirEstoque() {
        for (EstoqueItem item : estoque.getEstoque()) {
            System.out.println("Produto: " + item.getProduto().getCodigo() + " - Quantidade: " + item.getQuantidade());
        }
    }
}
