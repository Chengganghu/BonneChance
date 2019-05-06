package fr.lille.imt.patern.observer;

public class Test {
    public static void main(String[] args) {
        Appli appli = new Appli();
        TimeoutSource timeoutSource = new TimeoutSource(appli);
        timeoutSource.doSomething();
    }
}
