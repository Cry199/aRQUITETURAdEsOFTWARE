package FacadeExercícios4.pedido;

import FacadeExercícios4.estoque.Estoque;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private double valorTotal;
    private List<ItemPedido> lista = new ArrayList<>();

    public void adicionarItem(ItemPedido item) {
        if (Estoque.getInstance().removerDoEstoque(item.getProduto(), item.getQuantidade())) {
            lista.add(item);
            valorTotal += item.getPrecoTotal();
        } else {
            System.out.println("Produto indisponível em estoque.");
        }
    }

    public double calcularTotal() {
        return valorTotal;
    }

    public void cupomFiscal() {
        System.out.println("Cupom Fiscal:");
        for (ItemPedido item : lista) {
            System.out.println(item.getProduto().getCodigo() + " - " + item.getProduto().getNome() + " - " + item.getQuantidade() + " - " + item.getPrecoTotal());
        }
        System.out.println("Valor Total: " + valorTotal);
    }
}