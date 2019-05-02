package fr.lille.imt.thread.threadpool;

import java.util.concurrent.*;

public class CallableTest {
    public static void main(String[] args) {
        //创建线程池
        ExecutorService es = Executors.newSingleThreadExecutor();
        //创建callable对象任务
        CallableDemo callTast = new CallableDemo();
        //提交任务并获取执行结果
        Future<Integer> future = es.submit(callTast);
        //关闭线程池
        es.shutdown();
        try{
            System.out.println("主线程在执行其他任务");
            Thread.sleep(2000);
            if(future.get() != null){
                System.out.println("future.get-->"+future.get());
            }else{
                System.out.println("future.get()未获取到结果");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("main thread terminate");
    }
}
