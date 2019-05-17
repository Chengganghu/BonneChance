package fr.lille.imt.thread.threadpool;

import java.util.Queue;
import java.util.concurrent.*;

public class CallableTest2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService ex = Executors.newFixedThreadPool(2);
//        CallableDemo callableDemo = new CallableDemo();
//        ex.submit(callableDemo);
//        ex.submit(callableDemo);
//        ex.submit(callableDemo);
//        ex.shutdown();
//
//        FutureTask<Integer> futureTask = new FutureTask<>(callableDemo);
//        new Thread(futureTask).start();
//        System.out.println("res is: "+futureTask.get());

        CallableDemo callableDemo = new CallableDemo();
        ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(10);
        ExecutorService executorService = new ThreadPoolExecutor(3,5,1,TimeUnit.MINUTES,queue);
        for(int i=0;i<15;i++){
            Future<Integer> future = executorService.submit(callableDemo);
        }
        executorService.shutdown();
    }
}
