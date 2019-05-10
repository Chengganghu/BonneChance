package fr.lille.imt.toward.offer;

public class Num4 {
    public static int replaceEspace(char[] arr,int usedLength){
        if(arr == null||arr.length<usedLength)
            return -1;
        int numEspace = 0;
        for(char c:arr){
            if(c == ' ' )
                numEspace++;
        }
        int targetLength = usedLength + 2*numEspace;
        if(arr.length<targetLength)
            return -1;
        if(numEspace == 0)
            return usedLength;
        int tmpUsed = usedLength - 1;
        int tmpTarget = targetLength - 1;
        while(tmpUsed>=0){
            if(arr[tmpUsed] == ' '){
                arr[tmpTarget--] = '0';
                arr[tmpTarget--] = '2';
                arr[tmpTarget--] = '%';
            }else{
                arr[tmpTarget--] = arr[tmpUsed];
            }
            tmpUsed--;
        }
        return targetLength;
    }

    public static void main(String[] args) {
        char[]input = new char[50];
        input[0] = ' ';
        input[1] = 'w';
        input[2] = 'e';
        input[3] = ' ';
        input[4] = 'a';
        input[5] = 'r';
        input[6] = ' ';
        input[7] = 'e';
        replaceEspace(input,8);

    }
}
