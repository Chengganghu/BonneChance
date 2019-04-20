package fr.lille.imt.thread.syn;

public class ThreadTest {
    public static void main(String[] args) {
        MessageStorage messageStorage = new MessageStorage(10);
        Thread[] threads = new Thread[10];
        for(int i=0;i<5;i++){
            Thread thread = new Thread(new Producer(messageStorage,i));
            threads[i] = thread;
        }

        for(int i=0;i<5;i++){
            Thread thread = new Thread(new Consumer(messageStorage));
            threads[i+5] = thread;
        }

        for(int i=0;i<10;i++){
            Thread thread = threads[i];
            try{
                thread.start();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
//        new Thread(new fr.lille.imt.thread.syn.Consumer(messageStorage)).start();
//        new Thread(new fr.lille.imt.thread.syn.Producer(messageStorage,88)).start();
    }
}
