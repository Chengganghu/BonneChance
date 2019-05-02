package fr.lille.imt.thread.threadpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class CallableTest2 {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(2);
        CallableDemo callableDemo = new CallableDemo();
        ex.submit(callableDemo);
        ex.submit(callableDemo);
        ex.submit(callableDemo);
        ex.shutdown();
    }
}
