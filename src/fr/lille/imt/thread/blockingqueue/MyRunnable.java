package fr.lille.imt.thread.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class MyRunnable implements Runnable{
    private BlockingQueue<Integer> blockingQueue;
    public MyRunnable(BlockingQueue<Integer> blockingQueue){
        this.blockingQueue = blockingQueue;
    }
    @Override
    public void run() {
        for(int i=0;i<3;i++){
            blockingQueue.add(i);
        }
    }
}
