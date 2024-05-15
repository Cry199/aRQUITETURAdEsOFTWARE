package Observer2.naves;

import Observer2.acao.Acao;
import Observer2.observador.Observador;

public interface Assunto {

    public void adicionar(Observador observador);
    public void notificar();
    public void setAcao(Acao acao);
    public void remover(Observador observador);

}