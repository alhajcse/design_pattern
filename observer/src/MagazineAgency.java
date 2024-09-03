import java.util.ArrayList;
import java.util.List;

public class MagazineAgency implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String magazine;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(magazine);
        }
    }

    public void setMagazine(String newMagazine) {
        this.magazine = newMagazine;
        notifyObservers();
    }
}
