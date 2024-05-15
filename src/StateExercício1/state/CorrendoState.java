package StateExercício1.state;

import StateExercício1.jogador.Jogador;

public class CorrendoState extends JogadorState {

    public CorrendoState(Jogador jogador) {
        super(jogador);
    }

    @Override
    public void atualizar() {
    }

    @Override
    public void handleInput(String input) {
        switch (input) {
            case "parar":
                jogador.setState(new EsperandoState(jogador));
                break;
            case "pular":
                jogador.setState(new PulandoState(jogador));
                break;
            case "abaixar":
                jogador.setState(new AbaixandoState(jogador));
                break;
        }
    }
}