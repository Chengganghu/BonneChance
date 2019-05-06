package fr.lille.imt.patern.observer;

public class Appli implements TimeoutEventListener {


    @Override
    public void timeout(TimeoutEvent timeoutEvent) {
        System.out.println(timeoutEvent.getMes());
    }
}
