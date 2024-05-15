package Observer3.agencia;

import Observer3.observador.Observador;

import java.util.ArrayList;
import java.util.List;


public class Agencia {
    private List<Observador> observadores = new ArrayList<>();
    private VagaDeEmprego vagaAtual;

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(vagaAtual);
        }
    }

    public void publicarVaga(VagaDeEmprego vaga) {
        this.vagaAtual = vaga;
        notificarObservadores();
    }
}