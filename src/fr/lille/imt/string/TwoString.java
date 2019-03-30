package fr.lille.imt.string;

public class TwoString {
    public static  String s1 = "98765248729374";
    public static String s2 = "12345987";

    public static String solution(String s1,String s2){
        StringBuilder sb1 = new StringBuilder(s1).reverse();
        StringBuilder sb2 = new StringBuilder(s2).reverse();

        if(s1.length()>s2.length()){
            StringBuilder tmp = sb1;
            sb1 = sb2;
            sb2 = tmp;
        }
        int i = sb2.length() - sb1.length();
        while(i>0){
            sb1.append(0);
            i--;
        }
        s1 = sb1.reverse().toString();
        s2 = sb2.reverse().toString();
        StringBuilder stringBuilder = new StringBuilder();
        boolean flag = false;
        i=s2.length()-1;
        while(i>=0){
            int tmp1 = s1.charAt(i)-'0';
            int tmp2 = s2.charAt(i)-'0';
            if(flag){
                int tmp = tmp1+tmp2+1;
                if(tmp>=10)
                    flag = true;
                else
                    flag = false;
                stringBuilder.append(tmp%10);
            }else{
                int tmp = tmp1+tmp2;
                if(tmp>=10)
                    flag = true;
                else
                    flag = false;
                stringBuilder.append(tmp%10);
            }
            i--;
        }
        return stringBuilder.reverse().toString();

    }

    public static void main(String[] args) {
        String res = solution(s1,s2);
        System.out.println(res);
    }
}
