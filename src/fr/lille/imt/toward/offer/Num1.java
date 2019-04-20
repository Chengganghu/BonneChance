package fr.lille.imt.toward.offer;

public class Num1 {

    public static void main(String[] args) {


    }




    class MyException extends RuntimeException{
        private String message;

        public MyException(String message){
            this.message =  message;
        }

        public MyException(){}

        public String getMessage(){
            return this.message;
        }
    }
}
