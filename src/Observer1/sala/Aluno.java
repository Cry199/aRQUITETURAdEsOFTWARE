package Observer1.sala;

import Observer1.observable.Observable;
import Observer1.observable.Observer;

import java.util.ArrayList;
import java.util.List;

public class Aluno implements Observable {
    private String nome;
    private double p1;
    private double p2;
    private double media;
    private List<Observer> observers = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
        calcularMedia();
        notifyObservers("P1", p1);
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
        calcularMedia();
        notifyObservers("P2", p2);
    }

    public double getMedia() {
        return media;
    }

    private void calcularMedia() {
        this.media = (p1 + p2) / 2;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String tipoNota, double nota) {
        for (Observer observer : observers) {
            observer.update(this, tipoNota, nota);
        }
    }
}