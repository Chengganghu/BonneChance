package fr.lille.imt.dp;

public class Shoot {
    public static int nums = 0;
    public void solution(int time, int note){
        if(time == 10&&note == 90){

        }
    }

    public void fun(int time, int note){
        if(time <= 1){
            if(note<0||note>10)return;
            else{
                nums++;
                return;
            }

        }else{
            for(int i=0;i<=10;i++){
                fun(time -1,note-i);
            }
        }

    }



    public static void main(String[] args) {
        Shoot shoot = new Shoot();
        shoot.fun(10,10);
        System.out.println(nums);
    }
}
