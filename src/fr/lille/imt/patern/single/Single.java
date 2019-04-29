package fr.lille.imt.patern.single;

public class Single {
    private Single(){};
    private static volatile Single instance;
    public static Single getInstance(){
        if(instance == null){
            synchronized (Single.class){
                if(instance == null){
                    instance = new Single();
                }
            }
        }
        return instance;
    }
}
