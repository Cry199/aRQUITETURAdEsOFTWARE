package StateExercício1.state;

import StateExercício1.jogador.Jogador;

public class PulandoState extends JogadorState {

    private int tempoPulo;

    public PulandoState(Jogador jogador) {
        super(jogador);
        this.tempoPulo = 0;
    }

    @Override
    public void atualizar() {
        // O jogador está pulando
        tempoPulo++;
        if (tempoPulo > jogador.getTempoMaximoPulo()) {
            jogador.setState(new EsperandoState(jogador));
        }
    }

    @Override
    public void handleInput(String input) {
        switch (input) {
            case "parar":
                System.out.println("Jogador parou de pular");
                jogador.setState(new EsperandoState(jogador));
                break;
            case "abaixar":
                System.out.println("Jogador abaixando");
                jogador.setState(new AbaixandoState(jogador));
                break;
        }
    }
}