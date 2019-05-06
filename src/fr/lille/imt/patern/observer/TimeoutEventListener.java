package fr.lille.imt.patern.observer;

import java.util.EventListener;

public interface TimeoutEventListener extends EventListener {
    void timeout(TimeoutEvent timeoutEvent);
}
