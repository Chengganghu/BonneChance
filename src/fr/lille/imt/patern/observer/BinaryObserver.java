package fr.lille.imt.patern.observer;

import java.beans.IntrospectionException;

public class BinaryObserver extends Observer{
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary string: "+
                Integer.toBinaryString(subject.getState()));
    }
}
