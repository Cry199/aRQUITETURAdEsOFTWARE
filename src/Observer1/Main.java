package Observer1;

import Observer1.sala.Aluno;
import Observer1.sala.Coordenador;
import Observer1.sala.Diretor;
import Observer1.sala.Professor;

public class Main {
    public static void main(String[] args)
    {
        Aluno aluno = new Aluno("João");

        Professor professor = new Professor("Maria");
        Coordenador coordenador = new Coordenador("Carlos");
        Diretor diretor = new Diretor("Ana");
        
        aluno.addObserver(professor);
        aluno.addObserver(coordenador);
        aluno.addObserver(diretor);

        aluno.setP1(7.5);
        aluno.setP2(8.0);
    }
}
