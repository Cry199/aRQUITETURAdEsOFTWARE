package StateExercício1;

import StateExercício1.jogador.Jogador;

public class Main {
    public static void main(String[] args)
    {
        Jogador jogador = new Jogador();
        jogador.atualizar();
        System.out.println("Estado atual: " + jogador.getClass().getSimpleName());

        jogador.handleInput("mover para a direita");
        jogador.atualizar();

        jogador.handleInput("pular");
        jogador.atualizar();

        jogador.handleInput("parar");
        jogador.atualizar();

        jogador.handleInput("abaixar");
        jogador.atualizar();

        jogador.handleInput("pular");
        jogador.atualizar();

        jogador.handleInput("mover para a esquerda");
        jogador.atualizar();
    }
}