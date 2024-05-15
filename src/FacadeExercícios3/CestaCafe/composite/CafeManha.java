package FacadeExercícios3.CestaCafe.composite;

public class CafeManha implements CestaFacade {

    private Composite cesta = new Composite("Café da Manhã");

    @Override
    public void adicionarProduto(String nome, double preco) {
        cesta.adicionar(new Leaf(preco, nome));
    }

    @Override
    public void adicionarCesta(CestaFacade cesta) {

    }

    @Override
    public double getPrecoTotal() {
        return cesta.getPreco();
    }

    @Override
    public String getNome() {
        return cesta.getNome();
    }
}