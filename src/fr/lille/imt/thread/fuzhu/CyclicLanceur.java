package fr.lille.imt.thread.fuzhu;

import org.omg.PortableServer.THREAD_POLICY_ID;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicLanceur {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4, new Runnable() {
            @Override
            public void run() {
                System.out.println("this is task after all is done");
            }
        });
        for(int i=0;i<4;i++){
            new CyclicThread(cyclicBarrier).start();
        }
    }

    public static class CyclicThread extends Thread{
        private CyclicBarrier cyclicBarrier;

        public CyclicThread(CyclicBarrier cyclicBarrier){
            this.cyclicBarrier = cyclicBarrier;
        }

        public void run(){
            System.out.println(Thread.currentThread().getName()+" is running");

            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" has been finished, wait another task to be done");
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("all task done");
        }
    }
}
