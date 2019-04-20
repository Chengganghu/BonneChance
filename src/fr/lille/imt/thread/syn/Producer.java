package fr.lille.imt.thread.syn;

public class Producer implements Runnable {
    private MessageStorage messageStorage;
    private int index;

    public Producer(MessageStorage messageStorage,int index){
        this.messageStorage = messageStorage;
        this.index = index;
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            StringBuffer message = new StringBuffer("thread id: ");
            message.append(index);
            message.append("id: ");
            message.append(i);
            messageStorage.set(message.toString());
        }
    }
}
