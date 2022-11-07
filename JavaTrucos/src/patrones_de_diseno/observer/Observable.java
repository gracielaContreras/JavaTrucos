package patrones_de_diseno.observer;

import java.util.ArrayList;
import java.util.List;

abstract public class Observable {
    protected List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void remove(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers(){
        notifyObservers(null);
    }

/*    El método notifyObservers se encarga de notificar a cada uno de los observadores sobre el cambio,
    recorriendo la lista con el for y les invoca el método update*/
    public void notifyObservers(Object usuario){
        for(Observer observer : observers){
            observer.update(this, usuario);
        }
    }
}
