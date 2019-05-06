package fr.lille.imt.patern.observer;

import java.util.EventObject;

public class TimeoutEvent extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public TimeoutEvent(Object source) {
        super(source);
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public TimeoutEvent(Object source, String msg){
        super(source);
        this.mes = msg;
    }


    private String mes;
}


