package StateExercício1.state;

import StateExercício1.jogador.Jogador;

public abstract class JogadorState {

    protected Jogador jogador;

    public JogadorState(Jogador jogador) {
        this.jogador = jogador;
    }

    public abstract void atualizar();

    public abstract void handleInput(String input);
}
