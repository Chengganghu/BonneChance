package fr.lille.imt.thread.lock;

public class LockProducer implements Runnable {
    private LockBuffer buffer;

    public LockProducer(LockBuffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            buffer.write();
        }
    }
}
