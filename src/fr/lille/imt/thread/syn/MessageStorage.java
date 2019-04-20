package fr.lille.imt.thread.syn;

import java.util.LinkedList;
import java.util.List;

public class MessageStorage {
    private int maxSize;
    private List<String> messages;

    public MessageStorage(int maxSize){
        this.maxSize = maxSize;
        messages = new LinkedList<>();
    }

    public void set(String message){
        synchronized (this){
            while (messages.size() == maxSize){
                try{
                    System.out.println("message buffer is full,wait now");
                    wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            messages.add(message);
            System.out.println("add message: "+message+ "success");
            notifyAll();
        }
    }

    public String get(){
        String message = null;
        synchronized (this){
            while(messages.size()==0){
                System.out.println("the message buffer is empty now, wait");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            message = ((LinkedList<String>)messages).poll();
            System.out.println("get message: "+message + " success");
            notifyAll();
        }
        return message;
    }
}
