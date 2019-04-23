package fr.lille.imt.array;

import java.util.*;

public class BWMatrix {
    private static int n;
    private static int m;
    private static int[][]arr;

    public static void input(){
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String [] tmp = first.split(" ");
        n = Integer.parseInt(tmp[0]);
        m = Integer.parseInt(tmp[1]);
        arr = new int[n][m];
        for(int i=0;i<n;i++){
            String line = sc.nextLine();
            tmp = line.split(" ");
            for(int j=0;j<m;j++){
                arr[i][j] = Integer.parseInt(tmp[j]);
            }
        }
    }

    public static void main(String[] args) {
        input();
        List<Integer> odd = new LinkedList<>();
        List<Integer> parir = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i+j)%2 == 0)
                    parir.add(arr[i][j]);
                else
                    odd.add(arr[i][j]);
            }
        }
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int i:odd){
            if(map1.containsKey(i)){
                map1.put(i,map1.get(i)+1);
            }else{
                map1.put(i,1);
            }
        }
        for(int i:parir){
            if(map2.containsKey(i)){
                map2.put(i,map2.get(i)+1);
            }else{
                map2.put(i,1);
            }
        }

        int maxOdd=0,valOdd=0,maxPaire=0,valPaire=0;
        for(Map.Entry entry:map1.entrySet()){
            if((Integer)entry.getValue()>maxOdd){
                maxOdd = (Integer) entry.getValue();
                valOdd = (Integer)entry.getKey();
            }
        }
        for(Map.Entry entry:map2.entrySet()){
            if((Integer)entry.getValue()>maxPaire){
                maxPaire = (Integer)entry.getValue();
                valPaire = (Integer)entry.getKey();
            }
        }
        int secOdd = 0,valSecOdd = 0, secPaire = 0, valSecPaire = 0;
        map1.remove(valOdd);
        map2.remove(valPaire);
        for(Map.Entry entry:map1.entrySet()){
            if((Integer)entry.getValue()>maxOdd){
                secOdd = (Integer) entry.getValue();
                valSecOdd = (Integer)entry.getKey();
            }
        }
        for(Map.Entry entry:map2.entrySet()){
            if((Integer)entry.getValue()>maxPaire){
                secPaire = (Integer)entry.getValue();
                valSecPaire = (Integer)entry.getKey();
            }
        }

        if(valOdd != valPaire)
            System.out.println((n*m/2 - maxOdd) + (n*m - n*m/2 - maxPaire));
        else {
            int tmp1 = (n*m/2 - secOdd) + (n*m - n*m/2 - maxPaire);
            int tmp2 = (n*m/2 - maxOdd) + (n*m - n*m/2 - secPaire);
            System.out.println(Math.min(tmp1,tmp2));
        }
    }
}
