package StateExercício1.jogador;

import StateExercício1.state.EsperandoState;
import StateExercício1.state.JogadorState;

public class Jogador {

    private JogadorState state;

    public Jogador() {
        this.state = new EsperandoState(this);
    }

    public void setState(JogadorState state) {
        this.state = state;
    }

    public void atualizar() {
        state.atualizar();
    }

    public void handleInput(String input) {
        state.handleInput(input);
    }

    // Métodos para tempo máximo de pulo, altura do pulo, etc.
    public int getTempoMaximoPulo() {
        return 10; // Exemplo
    }
}