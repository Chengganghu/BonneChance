package fr.lille.imt.thread.lock;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockBuffer {
    private List<String> list = new LinkedList<>();
    private int capacity;
    final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    final Lock readLock = lock.readLock();
    final Lock writeLock = lock.writeLock();



    public LockBuffer(int capacity){
        this.capacity = capacity;
    }

    public void read(){
        readLock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+" ready for read");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName()+" read finished");
            readLock.unlock();
        }
    }

    public void write(){
        writeLock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+" ready for write");
            //Thread.sleep(500);
        } finally {
            System.out.println(Thread.currentThread().getName()+ "write finished");
            writeLock.unlock();
        }
    }
}
