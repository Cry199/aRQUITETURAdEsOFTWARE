package FacadeExercícios3.CestaCafe.composite;

public interface CestaFacade
{
    void adicionarProduto(String nome, double preco);
    void adicionarCesta(CestaFacade cesta);
    double getPrecoTotal();
    String getNome();
}