package Observer1.observable;

import Observer1.sala.Aluno;

public interface Observer {
    void update(Aluno aluno, String tipoNota, double nota);
}