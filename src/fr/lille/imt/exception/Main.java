package fr.lille.imt.exception;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.jeter();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
