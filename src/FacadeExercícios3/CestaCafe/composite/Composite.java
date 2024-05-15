package FacadeExercícios3.CestaCafe.composite;

import java.util.ArrayList;
import java.util.List;



/*
 *  Professor Gerson Risso
 */
public class Composite implements Component {

    private List<Component> lista;
    private String nome;
    
    public Composite(String nome) {
        lista = new ArrayList<>();
        this.nome = nome;
    }

    public void adicionar(Component component) {
        lista.add(component);
    }

    public void remover(Component component) {
        lista.remove(component);
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (Component c : lista) {
            total += c.getPreco();
        }
        return total;
    }

    public String getNome() { // Adiciona o getter
        return nome;
    }

    @Override
    public String toString() {
        return "Composite{" + "lista=" + lista + ", nome=" + nome + '}';
    }

}
