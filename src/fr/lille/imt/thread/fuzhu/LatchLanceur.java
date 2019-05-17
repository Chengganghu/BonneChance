package fr.lille.imt.thread.fuzhu;

import java.util.concurrent.CountDownLatch;

public class LatchLanceur {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(2);
        LatchTest lt = new LatchTest(cdl);

        new Thread(lt).start();
        new Thread(lt).start();

        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("all tast has been finished");
    }
}
