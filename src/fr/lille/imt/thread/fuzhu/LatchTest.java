package fr.lille.imt.thread.fuzhu;

import java.util.concurrent.CountDownLatch;

public class LatchTest implements Runnable {
    private CountDownLatch cdl ;

    public LatchTest(CountDownLatch cdl){
        this.cdl = cdl;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is running");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cdl.countDown();
        System.out.println(Thread.currentThread().getName()+" is finished");
    }
}
