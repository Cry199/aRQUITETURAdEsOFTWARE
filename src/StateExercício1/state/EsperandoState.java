package StateExercício1.state;

import StateExercício1.jogador.Jogador;

public class EsperandoState extends JogadorState {

    public EsperandoState(Jogador jogador) {
        super(jogador);
    }

    @Override
    public void atualizar() {
    }

    @Override
    public void handleInput(String input) {
        switch (input) {
            case "mover para a direita":
                System.out.println("Jogador se movendo para a direita");
                jogador.setState(new CorrendoState(jogador));
                break;
            case "mover para a esquerda":
                System.out.println("Jogador se movendo para a esquerda");
                jogador.setState(new CorrendoState(jogador));
                break;
            case "pular":
                System.out.println("Jogador pulando");
                jogador.setState(new PulandoState(jogador));
                break;
            case "abaixar":
                System.out.println("Jogador abaixando");
                jogador.setState(new AbaixandoState(jogador));
                break;
        }
    }
}