package fr.lille.imt.patern.observer;

public class TimeoutSource  {
    protected TimeoutEventListener tel;

    public TimeoutSource(TimeoutEventListener t){
        tel = t;
    }

    public void doSomething(){
        TimeoutEvent timeoutEvent = new TimeoutEvent(this,"message");
        tel.timeout(timeoutEvent);
    }
}
