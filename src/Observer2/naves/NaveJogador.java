package Observer2.naves;

import Observer2.acao.Acao;
import Observer2.observador.Observador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NaveJogador implements Assunto {

    private static NaveJogador instance;
    private List<Observador> lista;
    private Acao acao;
    private String nome;

    private NaveJogador(String nome) {
        lista = new ArrayList<>();
        this.nome = nome;
    }

    public static NaveJogador getObejct(String nome) {
        if (instance == null) {
            instance = new NaveJogador(nome);
        }
        return instance;
    }

    @Override
    public void adicionar(Observador observador) {
        lista.add(observador);

    }

    @Override
    public void remover(Observador observador) {
        lista.remove(observador);
    }

    @Override
    public void notificar() {
        for(Observador observador: lista  ){
            observador.atualizar(acao);
        }

    }

    @Override
    public void setAcao(Acao acao) {
        this.acao=acao;
        notificar();
    }

    public void movimentoAleatorio() {
        Acao[] acoes = Acao.values();
        Random random = new Random();
        setAcao(acoes[random.nextInt(acoes.length)]);
    }

}
