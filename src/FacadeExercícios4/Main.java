package FacadeExercícios4;

import FacadeExercícios4.facade.Facade;
import FacadeExercícios4.pedido.ItemPedido;
import FacadeExercícios4.produto.Produto;

public class Main
{
    public static void main(String[] args)
    {
        Facade facade = new Facade();

        // Cria um pedido com produtos do estoque
        Produto produto1 = new Produto(1, 10.0, "Eletrônicos");
        Produto produto2 = new Produto(2, 5.0, "Alimentos");
        facade.criarPedido(new ItemPedido(produto1, 2));
        facade.criarPedido(new ItemPedido(produto2, 1));

        // Calcula o total do pedido
        System.out.println("Total do pedido: R$ " + facade.calcularTotal());

        // Imprime o cupom fiscal
        facade.imprimirCupomFiscal();

        // Exibe o estoque
        System.out.println("\nEstoque:");
        facade.exibirEstoque();
    }
}
