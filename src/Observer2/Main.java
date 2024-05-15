package Observer2;

import Observer2.naves.NaveInimiga;
import Observer2.naves.NaveJogador;

public class Main
{
    public static void main(String[] args) {

        NaveJogador naveJogador = NaveJogador.getObejct("eu");
        NaveInimiga naveInimiga1 = new NaveInimiga("eu2", naveJogador);
        NaveInimiga naveInimiga2 = new NaveInimiga("eu3", naveJogador);

        for (int i = 0; i < 10; i++) {
            naveJogador.movimentoAleatorio();
        }

        naveJogador.remover(naveInimiga1);
        System.out.println("Nave inimiga 1 destruída");

        for (int i = 0; i < 10; i++) {
            naveJogador.movimentoAleatorio();
        }
    }
}

