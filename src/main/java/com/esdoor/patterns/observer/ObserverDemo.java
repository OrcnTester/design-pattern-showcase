package com.esdoor.patterns.observer;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void onEvent(String msg);
}

class Subject {
    private final List<Observer> observers = new ArrayList<>();
    public void subscribe(Observer o) { observers.add(o); }
    public void unsubscribe(Observer o) { observers.remove(o); }
    public void publish(String msg) {
        for (Observer o : observers) o.onEvent(msg);
    }
}

class LoggingObserver implements Observer {
    public void onEvent(String msg) {
        System.out.println("[LOG] " + msg);
    }
}

class EmailObserver implements Observer {
    public void onEvent(String msg) {
        System.out.println("[EMAIL] " + msg);
    }
}

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.subscribe(new LoggingObserver());
        subject.subscribe(new EmailObserver());
        subject.publish("Contract PDF generated.");
        subject.publish("Measurement PDF generated.");
    }
}
