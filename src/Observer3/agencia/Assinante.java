package Observer3.agencia;

import Observer3.observador.Observador;

public class Assinante implements Observador {
    private String nome;

    public Assinante(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(VagaDeEmprego vaga) {
        System.out.println("Assinante " + nome + " recebeu notificação de nova vaga:\n" + vaga);
    }
}

