package Observer1.observable;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String tipoNota, double nota);
}
