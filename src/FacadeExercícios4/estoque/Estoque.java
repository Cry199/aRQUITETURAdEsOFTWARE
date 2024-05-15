package FacadeExercícios4.estoque;

import FacadeExercícios4.produto.Produto;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private static Estoque instance;
    private List<EstoqueItem> estoque = new ArrayList<>();

    private Estoque() {
        // Inicializa o estoque com alguns produtos
        adicionarProduto(new Produto(1, 10.0, "Eletrônicos"), 10);
        adicionarProduto(new Produto(2, 5.0, "Alimentos"), 5);
        adicionarProduto(new Produto(3, 20.0, "Vestuário"), 2);
    }

    public static Estoque getInstance() {
        if (instance == null) {
            instance = new Estoque();
        }
        return instance;
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        estoque.add(new EstoqueItem(produto, quantidade));
    }

    // Método para remover um produto do estoque
    public boolean removerDoEstoque(Produto produto, int quantidade) {
        for (EstoqueItem item : estoque) {
            if (item.getProduto().getCodigo() == produto.getCodigo() && item.getQuantidade() >= quantidade) {
                item.setQuantidade(item.getQuantidade() - quantidade);
                return true;
            }
        }
        return false;
    }

    public List<EstoqueItem> getEstoque() {
        return estoque;
    }
}