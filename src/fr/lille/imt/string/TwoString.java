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

    public static String solution2(String str1,String str2){
        int index1 = str1.length() -1;
        int index2 = str2.length() -1;
        int carry = 0;
        int num;
        StringBuilder sb = new StringBuilder();
        while(index1>=0||index2>=0){
            int num1 = index1<0?0:str1.charAt(index1)-'0';
            int num2 = index2<0?0:str2.charAt(index2)-'0';
            sb.append((num1+num2+carry)%10);
            carry = (num1+num2+carry)/10;
            index1--;
            index2--;
        }
        if(carry == 1)
            sb.append(1);
        return sb.reverse().toString();

    }

    public static void main(String[] args) {
        String res = solution2("99009990","99887767");
        System.out.println(res);
    }
}
