package Observer1.sala;

import Observer1.observable.Observer;

public class Diretor implements Observer {
    private String nome;

    public Diretor(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Aluno aluno, String tipoNota, double nota) {
        System.out.println("Diretor " + nome + " notificado:");
        System.out.println("Aluno: " + aluno.getNome() + " - " + tipoNota + ": " + nota + " - Média: " + aluno.getMedia());
    }
}