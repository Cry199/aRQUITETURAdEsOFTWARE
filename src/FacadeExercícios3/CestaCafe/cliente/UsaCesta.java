package FacadeExercícios3.CestaCafe.cliente;

import FacadeExercícios3.CestaCafe.composite.Aniversario;
import FacadeExercícios3.CestaCafe.composite.CafeManha;
import FacadeExercícios3.CestaCafe.composite.CestaFacade;

public class UsaCesta
{
  public static void main(String[] args)
  {
    CestaFacade cafeManha = new CafeManha();
    cafeManha.adicionarProduto("Café", 12.56);
    cafeManha.adicionarProduto("Leite", 10.26);
    cafeManha.adicionarProduto("Pão de Queijo", 6.12);

    CestaFacade aniversario = new Aniversario();
    aniversario.adicionarProduto("Chocolate", 8.23);
    aniversario.adicionarProduto("Bombom", 9.78);
    aniversario.adicionarCesta(cafeManha);

    System.out.println("Cesta de Aniversário:");
    System.out.println("Nome: " + aniversario.getNome());
    System.out.println("Total: " + aniversario.getPrecoTotal());

    System.out.println("\nCesta de Café da Manhã:");
    System.out.println("Nome: " + cafeManha.getNome());
    System.out.println("Total: " + cafeManha.getPrecoTotal());
  }
}
