package fr.lille.imt.thread.syn;

public class Consumer implements Runnable {
    private MessageStorage messageStorage;

    public Consumer(MessageStorage messageStorage){
        this.messageStorage = messageStorage;
    }


    @Override
    public void run() {
        for(int i=0;i<5;i++){
            messageStorage.get();
        }
    }
}
