package fr.lille.imt.thread.blockingqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {
    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue =  new ArrayBlockingQueue<Integer>(10);
        MyRunnable myRunnable = new MyRunnable(blockingQueue);
        for(int i=0;i<5;i++){
            new Thread(myRunnable).start();
        }

        Queue<Integer>  queue = new LinkedList<>();
    }
}
