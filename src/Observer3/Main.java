package Observer3;

import Observer3.agencia.Agencia;
import Observer3.agencia.Assinante;
import Observer3.agencia.VagaDeEmprego;

public class Main {
    public static void main(String[] args) {
        // Criar Agência
        Agencia agencia = new Agencia();

        // Criar Assinantes
        Assinante assinante1 = new Assinante("João");
        Assinante assinante2 = new Assinante("Maria");
        Assinante assinante3 = new Assinante("Pedro");

        // Adicionar Assinantes à Agência
        agencia.adicionarObservador(assinante1);
        agencia.adicionarObservador(assinante2);
        agencia.adicionarObservador(assinante3);

        // Publicar Vagas de Emprego
        agencia.publicarVaga(new VagaDeEmprego("Desenvolvedor Java", "Experiência em Spring Boot"));
        agencia.publicarVaga(new VagaDeEmprego("Analista de Dados", "Conhecimento em Python e SQL"));
    }
}