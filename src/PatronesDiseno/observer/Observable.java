package PatronesDiseno.observer;

import java.util.ArrayList;
import java.util.List;

abstract public class Observable {
    protected List<Observer> observers= new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notificarObservadores(){
        notificarObservadores(null);
    }

    public void notificarObservadores(Object o){
        for (Observer observer : observers) {
            observer.actualizar(this,o);
        }
    }
}
