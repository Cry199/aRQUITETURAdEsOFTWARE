package FacadeExercícios3.CestaCafe.composite;

public class Aniversario  implements CestaFacade{
    private Composite cesta = new Composite("Aniversário");

    @Override
    public void adicionarProduto(String nome, double preco) {
        cesta.adicionar(new Leaf(preco, nome));
    }

    @Override
    public void adicionarCesta(CestaFacade cesta) {
        this.cesta.adicionar(new CestaFacadeAdapter(cesta));
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
