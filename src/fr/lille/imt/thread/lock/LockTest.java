package fr.lille.imt.thread.lock;

public class LockTest {
    public static void main(String[] args) {
        LockBuffer buffer = new LockBuffer(10);
        for(int i=0;i<20;i++){
            //new Thread(new LockConsumer(buffer)).start();
            new Thread(new LockProducer(buffer)).start();
        }
        for(int i=0;i<20;i++){
            new Thread(new LockConsumer(buffer)).start();

        }
    }
}
