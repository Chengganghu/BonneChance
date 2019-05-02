package fr.lille.imt.thread.threadpool;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable<Integer> {
    private int sum;
    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName()+" begins");
        Thread.sleep(5000);
        for(int i=0;i<5000;i++){
            sum = sum + i;
        }
        System.out.println(Thread.currentThread().getName()+" ends");
        return sum;
    }

    /**
     * pool-1-thread-1 begins
     * pool-1-thread-2 begins
     * pool-1-thread-2 ends
     * pool-1-thread-1 ends
     * pool-1-thread-2 begins
     * pool-1-thread-2 ends
     *
     * 以上是运行结果，三个任务只用了两个线程
     */
}
