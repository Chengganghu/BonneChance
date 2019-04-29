package fr.lille.imt.patern.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
