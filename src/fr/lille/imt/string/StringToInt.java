package fr.lille.imt.string;

public class StringToInt {
    public static int solution(String str){
        if(str.length() == 0)
            throw new IllegalArgumentException("cant be empty");
        char plusOrMoins = str.charAt(str.length()-1);
        int res = 0;
        if(plusOrMoins == '-'){
            try{
                for(int i=0;i<str.length()-1;i++){
                    if(intOrNot(str.charAt(i)))
                        res += (str.charAt(i)-'0')*Math.pow(10,i);
                    else
                        throw new IllegalArgumentException("must be number");
                }
                res = 0-res;

            }catch(Exception e){

                String tmp  = new StringBuilder(str).reverse().toString();
                if(tmp.equals(String.valueOf(Integer.MIN_VALUE)));
                res = Integer.MIN_VALUE;

            }
        }else{
            try{
                for(int i=0;i<str.length();i++) {
                    res += (str.charAt(i) - '0') * Math.pow(10, i);
                }
            }catch(Exception e){

            }
        }

        return res;
    }

    public static boolean intOrNot(char c){
        if(c-'0'>=0&&c-'0'<=9)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(solution("23908p9-"));
    }
}
